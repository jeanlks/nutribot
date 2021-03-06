package com.nutribot.nutribot;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;


@Service
@Slf4j
public class TelegramServiceImpl extends TelegramLongPollingBot implements TelegramService{

    private static final Double MAX_SIMILARITY_DISTANCE = 0.87;
    private static final String PREFIX = "temp";
    private static final String SUFFIX = "image";

    @Value("${chat.telegram.auth.poolingToken}")
    private String TOKEN;

    @Value("${chat.telegram.auth.username}")
    private String username;

    @Override
    public void onUpdateReceived(Update update) {
        NutriBootstrap bootstrap = new NutriBootstrap();

        if (update.hasMessage() && update.getMessage().hasText()) {
            log.info("User connected, asked question: " + update.getMessage().getText());
            SendMessage response = new SendMessage();
            response.setChatId(String.valueOf(update.getMessage().getChat().getId()));
            response.setText(update.getMessage().getText());
            Question answer = bootstrap.getQuestions().stream()
                    .filter(q -> findTrigger(q.possibleQuestions, update.getMessage().getText(), q.similarityScore))
                    .findFirst()
                    .orElse(new Question(new String[]{"Desculpe não entendi muito bem a sua pergunta!"}));
            response.setText(getRandom(answer.getPossibleAnswers()));

            try {
                execute(response);
                if (answer.getImageLocation()!=null){
                    for (String imageLocation: answer.getImageLocation()) {
                        SendPhoto sendPhoto = new SendPhoto();
                        sendPhoto.setChatId(String.valueOf(update.getMessage().getChat().getId()));
                        InputStream image = new ClassPathResource(imageLocation).getInputStream();
                        sendPhoto.setPhoto(stream2file(image));
                        execute(sendPhoto);
                    }
                }
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        }

    }

    private String  getRandom(String[] possibleAnswers) {
        int rnd = new Random().nextInt(possibleAnswers.length);
        return possibleAnswers[rnd];

    }

    private boolean findTrigger(String[] triggerMessages, String message, double similarityScore) {
        JaroWinklerDistance jk = new JaroWinklerDistance();
        long matches = Arrays.stream(triggerMessages)
                .filter((s) -> jk.apply(s.toLowerCase(), message.toLowerCase()) > similarityScore)
                .count();
        return matches > 0;
    }

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    public static File stream2file (InputStream in) throws IOException {
        final File tempFile = File.createTempFile(PREFIX, SUFFIX);
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(in, out);
        }
        return tempFile;
    }
}
