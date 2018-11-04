package com.nutribot.nutribot;

import org.apache.commons.text.similarity.JaccardDistance;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import org.apache.commons.text.similarity.LevenshteinDetailedDistance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Arrays;
import java.util.Random;


@Service
public class TelegramServiceImpl extends TelegramLongPollingBot implements TelegramService{

    private static final Double MAX_SIMILARITY_DISTANCE = 0.65;

    @Value("${chat.telegram.auth.poolingToken}")
    private String TOKEN;

    @Value("${chat.telegram.auth.username}")
    private String username;

    @Override
    public void onUpdateReceived(Update update) {
        NutriBootstrap bootstrap = new NutriBootstrap();

        if (update.hasMessage() && update.getMessage().hasText()) {

            SendMessage response = new SendMessage();
            response.setChatId(String.valueOf(update.getMessage().getChat().getId()));
            response.setText(update.getMessage().getText());
            String answer = bootstrap.getQuestions().stream()
                    .filter(q -> findTrigger(q.possibleQuestions, update.getMessage().getText()))
                    .map(a -> getRandom(a.possibleAnswers))
                    .findFirst()
                    .orElse("Desculpe não entendi muito bem a sua pergunta!");
            response.setText(answer);


            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }

    private String  getRandom(String[] possibleAnswers) {
        int rnd = new Random().nextInt(possibleAnswers.length);
        return possibleAnswers[rnd];

    }

    private boolean findTrigger(String[] triggerMessages, String message) {
        JaroWinklerDistance jk = new JaroWinklerDistance();
        long matches = Arrays.stream(triggerMessages)
                .filter((s) -> jk.apply(s.toLowerCase(), message.toLowerCase()) > MAX_SIMILARITY_DISTANCE)
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
}
