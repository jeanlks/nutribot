package com.nutribot.nutribot;

import java.util.ArrayList;
import java.util.List;

public class NutriBootstrap {

    public List<Question> getQuestions(){
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(0, new String[]{"/start", "Oi", "Olá"}
                , new String[]{"Olá, eu sou o NutriBot estou aqui pra te ajudar a cuidar dos pacientes, como posso te ajudar? " +
                "\n\n Aqui vão alguns exemplos do que você pode me perguntar:" +
                "\n 1. Quais os cuidados o manipulador da dieta deve ter? " +
                "\n 2. Como preparar solução clorada" +
                "\n 3. Como fazer manipulação da dieta artesanal "}));

        questions.add(new Question(0, new String[]{"Boa noite"}
                , new String[]{"Boa noite, em que posso lhe ajudar?"}));

        questions.add(new Question(0, new String[]{"Bom dia"}
                , new String[]{"Bom dia, em que posso lhe ajudar?"}));

        questions.add(new Question(0, new String[]{"Boa tarde"}
                , new String[]{"Boa tarde, em que posso lhe ajudar?"}));

        questions.add(new Question(0, new String[]{"Obrigado", "valeu", "show"}
                , new String[]{"Foi um prazer te ajudar, sempre que precisar estou aqui",
                "Por nada",
                "Foi ótimo te ajudar, conte comigo!"}));

        questions.add( new Question(1, new String[]{"O que é a alimentação enteral?"}
        , new String[]{"Quando a alimentação pela boca é insuficiente ou impossível de ser realizada, suas necessidades nutricionais podem ser satisfeitas através da nutrição enteral. A Terapia Nutricional Enteral, é utilizada em pacientes que não conseguem ingerir diariamente a quantidade de nutrientes necessária para atingir suas necessidades nutricionais, e constitui uma importante ferramenta que a nutrição utiliza em diversas situações clínicas.\n"}));

        questions.add(new Question(2, new String[]{"Como fazer a higienização correta das mãos"}
                , new String[]{"1. Umedeça as mãos e os antebraços com água;\n" +
                "2.  Passe sabão ou detergente e esfregue durante 15 segundos;\n" +
                "3.  Enxágue e seque bem as mãos e os antebraços;\n" +
                "4.  Desinfetar com solução de álcool 70%;\n" +
                "5.  Deixe secar as mãos naturalmente ao ar livre ou com papel toalha.\n"}));


        questions.add(new Question(3, new String[]{"Como fazer a preparação de álcool"}
                , new String[]{"Para se fazer a preparação do álcool 70% é necessário" +
                "1. Pegar um recipiente com capacidade de 1 litro; \n" +
                "2.  Adicionar 750 ml de álcool com densidade de 96% e 97%;\n" +
                "3.  Adicionar 250 ml de água destilada, e misturar;\n" +
                "4.  Distribuir em borrifadores identificados. \n"}));

        questions.add(new Question(4, new String[]{"Quando as mão devem ser higienizadas "}
                , new String[]{"As mão devem ser bem higienizadas quando: \n" +
                "1. Utilizar os sanitários ou vestiários;\n" +
                "2. Iniciar, interromper ou trocar de atividade;\n" +
                "3. Após manipular alimentos crus ou não higienizados;\n" +
                "4. Antes de manipular alimentos submetidos à cocção higienizados ou prontos para consumo;\n" +
                "5. Tossir, espirrar, assoar o nariz, tocar no corpo ou cabelo;\n" +
                "6. Usar utensílios e materiais de limpeza, como vassouras, rodos, pás, panos de limpeza, entre outros;\n" +
                "7. Manipular lixo e outros resíduos;\n" +
                "8. Tocar em sacarias, caixas, garrafas, maçanetas, sapatos ou outros objetos estranhos à atividade;\n" +
                "9. Pegar em dinheiro.\n"}));


        questions.add(new Question(5, new String[]{"quais os cuidados o manipulador da dieta deve ter"}
                , new String[]{"Ao se manipular a dieta é importante: \n" +
                "1. Não utilizar colares, pulseiras, anéis, amuletos, fitas, brincos, unhas e cílios postiços, relógio e aliança;\n" +
                "2. Utilizar touca; \n" +
                "3. Manter as unhas cortadas.\n" +
                "E deve evitar os seguintes hábitos durante a manipulação \n" +
                "Cantar, assobiar ou falar sobre os alimentos;\n" +
                "Espirrar, tossir, assoar o nariz ou cuspir;\n" +
                "Comer, beber, mascar chiclete;\n" +
                "Pentear, coçar, pôr os dedos no nariz, boca ou ouvido ou passar as mãos nos cabelos;\n" +
                "Fazer uso de utensílios e equipamentos sujos;\n" +
                "Enxugar o suor com as mãos, panos ou qualquer peça da vestimenta;\n" +
                "Manipular dinheiro.\n"}));

        questions.add(new Question(6, new String[]{"como preparar solução clorada"}
                , new String[]{"Para o preparo da solução clorada é necessário: " +
                "1. Separar um recipiente com capacidade de 1 litro;\n" +
                "2. Adicionar 1 litro de água tratada;\n" +
                "3. Adicionar 1 colher de sopa de água sanitária.\n"}));

        questions.add(new Question(7, new String[]{"como fazer a higienização da pia, mesa, utensílios, talheres, panelas, pratos, copos e tábua de carne"}
                , new String[]{"1. Retire todos os restos alimentares das superfícies;\n" +
                "2. Lave com abundantemente detergente e enxágue;\n" +
                "3. No caso da pia, borrife superficialmente a solução de cloro. Já os utensílios, como talheres, copos, peneira e frasco de dieta e liquidificador, mergulhe-os na solução de cloro. O contato com esta solução deve ser de 15 minutos; \n" +
                "4. Enxágue em água corrente e deixe secar naturalmente;\n" +
                "5. Manter todos os utensílios sempre limpos sempre depois de utilizar, para que não ocorra contaminação.\n"}));

        questions.add(new Question(8, new String[]{"como fazer higienização do liquidificador"}
                , new String[]{"1. Retirar da tomada e desmontar;\n" +
                "2. Lavar com detergente;\n" +
                "3. Enxaguar com água corrente;\n" +
                "4. Realizar a sanitização com solução clorada;\n" +
                "5. Enxaguar novamente com água corrente tratada;\n" +
                "6. Remontar;\n" +
                "7. Jogar água quente e deixar por 15 minutos;\n" +
                "8. Deixar secar;\n" +
                "9. Guardar em local limpo e fechado.\n"}));

        questions.add(new Question(9, new String[]{"como fazer a higienização do frasco do equipo"}
                , new String[]{"Recomenda-se a troca diária do equipo e do frasco, porém se estes precisarem ser reutilizados faça da seguinte maneira: \n" +
                "Lave o frasco e o equipo com detergente e enxágue abundantemente em água corrente;\n" +
                "Coloque o frasco e o equipo em solução de cloro e deixe por 7 horas;\n" +
                "Enxágue e deixe secar ao ar livre por 1 hora;\n" +
                "Guardar o frasco na geladeira até ser reutilizado;\n"}));

        return questions;
    }
}
