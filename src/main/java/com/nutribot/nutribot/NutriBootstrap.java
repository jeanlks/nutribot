package com.nutribot.nutribot;

import java.util.ArrayList;
import java.util.List;

public class NutriBootstrap {

    public List<Question> getQuestions(){
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(0, new String[]{"/start", "Oi", "Olá"}
                , new String[]{"Olá, eu sou o NutriBot estou aqui pra te ajudar a cuidar dos pacientes \uD83C\uDFE5, como posso te ajudar? " +
                "\n\n Aqui vão alguns exemplos do que você pode me perguntar:" +
                "\n 1. Quais os cuidados o manipulador da dieta deve ter? " +
                "\n 2. Qual a dieta artesanal?" +
                "\n 3. Como fazer manipulação da dieta artesanal " +
                "\n 4. Como fazer a dieta artesanal "},0.90) );

        questions.add(new Question(0, new String[]{"Boa noite"}
                , new String[]{"Boa noite, em que posso lhe ajudar?"}, 0.9));

        questions.add(new Question(0, new String[]{"Bom dia"}
                , new String[]{"Bom dia, em que posso lhe ajudar?"}, 0.9));

        questions.add(new Question(0, new String[]{"Boa tarde"}
                , new String[]{"Boa tarde, em que posso lhe ajudar?"}, 0.9));

        questions.add(new Question(0, new String[]{"kk","rsrs","haha"}
                , new String[]{"Não era pra ser engraçado, mas já que você achou \uD83D\uDE02 \uD83D\uDE02",
                "\uD83D\uDE02 \uD83D\uDE02",
                "\uD83D\uDE1D \uD83D\uDE1D"}, 0.92));

        questions.add(new Question(0, new String[]{"Obrigado", "valeu", "show"}
                , new String[]{"Foi um prazer te ajudar, sempre que precisar estou aqui",
                "Por nada",
                "Foi ótimo te ajudar, conte comigo!"},0.88));

        questions.add( new Question(1, new String[]{"O que é a alimentação enteral?"}
        , new String[]{"Quando a alimentação pela boca é insuficiente ou impossível de ser realizada, suas necessidades nutricionais podem ser satisfeitas através da nutrição enteral. A Terapia Nutricional Enteral, é utilizada em pacientes que não conseguem ingerir diariamente a quantidade de nutrientes necessária para atingir suas necessidades nutricionais, e constitui uma importante ferramenta que a nutrição utiliza em diversas situações clínicas.\n"},0.88));

        questions.add(new Question(2, new String[]{"Como fazer a higienização correta das mãos", "Como fazer a higienização das mãos"}
                , new String[]{"1. Umedeça as mãos e os antebraços com água;\n" +
                "2.  Passe sabão ou detergente e esfregue durante 15 segundos;\n" +
                "3.  Enxágue e seque bem as mãos e os antebraços;\n" +
                "4.  Desinfetar com solução de álcool 70%;\n" +
                "5.  Deixe secar as mãos naturalmente ao ar livre ou com papel toalha.\n"},0.94));


        questions.add(new Question(3, new String[]{"Como fazer a preparação de álcool"}
                , new String[]{"Para se fazer a preparação do álcool 70% é necessário" +
                "\n1. Um recipiente com capacidade de 1 litro; \n" +
                "2.  Adicionar 750 ml de álcool com densidade de 96% e 97%;\n" +
                "3.  Adicionar 250 ml de água destilada, e misturar;\n" +
                "4.  Distribuir em borrifadores identificados. \n"},0.88));

        questions.add(new Question(4, new String[]{"Quando as mãos devem ser higienizadas "}
                , new String[]{"As mãos devem ser bem higienizadas quando: \n" +
                "1. Utilizar os sanitários ou vestiários;\n" +
                "2. Iniciar, interromper ou trocar de atividade;\n" +
                "3. Após manipular alimentos crus ou não higienizados;\n" +
                "4. Antes de manipular alimentos submetidos à cocção higienizados ou prontos para consumo;\n" +
                "5. Tossir, espirrar, assoar o nariz, tocar no corpo ou cabelo;\n" +
                "6. Usar utensílios e materiais de limpeza, como vassouras, rodos, pás, panos de limpeza, entre outros;\n" +
                "7. Manipular lixo e outros resíduos;\n" +
                "8. Tocar em sacarias, caixas, garrafas, maçanetas, sapatos ou outros objetos estranhos à atividade;\n" +
                "9. Pegar em dinheiro.\n"},0.88));


        questions.add(new Question(5, new String[]{"quais os cuidados o manipulador da dieta deve ter", "Quais cuidados devo ter ao manipular a dieta?"}
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
                "Manipular dinheiro.\n"},0.88));

        questions.add(new Question(6, new String[]{"como preparar solução clorada"}
                , new String[]{"Para o preparo da solução clorada é necessário: \n" +
                "1. Separar um recipiente com capacidade de 1 litro;\n" +
                "2. Adicionar 1 litro de água tratada;\n" +
                "3. Adicionar 1 colher de sopa de água sanitária.\n"},0.88));

        questions.add(new Question(7, new String[]{"como fazer a higienização da pia, mesa, utensílios, talheres, panelas, pratos, copos e tábua de carne"}
                , new String[]{"1. Retire todos os restos alimentares das superfícies;\n" +
                "2. Lave com abundantemente detergente e enxágue;\n" +
                "3. No caso da pia, borrife superficialmente a solução de cloro. Já os utensílios, como talheres, copos, peneira e frasco de dieta e liquidificador, mergulhe-os na solução de cloro. O contato com esta solução deve ser de 15 minutos; \n" +
                "4. Enxágue em água corrente e deixe secar naturalmente;\n" +
                "5. Manter todos os utensílios sempre limpos sempre depois de utilizar, para que não ocorra contaminação.\n"},0.88));

        questions.add(new Question(8, new String[]{"como fazer higienização do liquidificador"}
                , new String[]{"1. Retirar da tomada e desmontar;\n" +
                "2. Lavar com detergente;\n" +
                "3. Enxaguar com água corrente;\n" +
                "4. Realizar a sanitização com solução clorada;\n" +
                "5. Enxaguar novamente com água corrente tratada;\n" +
                "6. Remontar;\n" +
                "7. Jogar água quente e deixar por 15 minutos;\n" +
                "8. Deixar secar;\n" +
                "9. Guardar em local limpo e fechado.\n"},0.88));

        questions.add(new Question(9, new String[]{"como fazer a higienização do frasco do equipo"}
                , new String[]{"Recomenda-se a troca diária do equipo e do frasco, porém se estes precisarem ser reutilizados faça da seguinte maneira: \n" +
                "Lave o frasco e o equipo com detergente e enxágue abundantemente em água corrente;\n" +
                "Coloque o frasco e o equipo em solução de cloro e deixe por 7 horas;\n" +
                "Enxágue e deixe secar ao ar livre por 1 hora;\n" +
                "Guardar o frasco na geladeira até ser reutilizado;\n"},0.88));

        questions.add(new Question(10, new String[]{"como fazer manipulação da dieta artesanal", "como faço a manipulação da dieta artesanal"}
                , new String[]{"Para fazer a manipulação da dieta artesanal é necessário \n" +
                "1. Higienização dos utensílios \n" +
                "2. Higienização das mãos \n" +
                "3. Separar os alimentos que serão utilizados\n" +
                "4. Higienizar as embalagens com solução de álcool \n" +
                "5. Lave as mãos\n" +
                "6. Prepare a dieta como recomendado\n" +
                "7. Coloque a dieta em frascos recomendados e devidamente higienizados\n" +
                "8. A dieta deve ser administrada em temperatura ambiente\n" +
                "9. A dieta deve ser manipulada uma vez por dia, e dura apenas um dia.\n"},0.90));


        questions.add(new Question(11, new String[]{"como fazer a manipulação da fórmula do sistema fechado"}
                , new String[]{"Para a manipulação da fórmula é necessário \n" +
                "1. Higienizar as mãos; \n" +
                "2. Higienizar bem o equipo e demais utensílios utilizados;\n" +
                "3. Verifique a data de validade e agite o produto antes de usá-lo.\n"},0.88));

        questions.add(new Question(12, new String[]{"como fazer a administração da dieta pelo equipo ? "}
                , new String[]{"Para fazer a administração da dieta pela sonda é necessário \n" +
                "1. Colocar o indivíduo sentado ou deitado com a cabeceira elevada, enquanto receber a dieta, e deixá-lo assim um tempo depois da administração, para evitar engasgos ou outro tipo de intercorrências;\n" +
                "2. Conectar o equipo no frasco lembrando-se de fechar a roldana antes de fazer a conexão;\n" +
                "3. Pendurar o frasco no suporte que deve estar em um local elevado;\n" +
                "4. Abrir a roldana do equipo e deixar as gotas caírem lentamente. A dieta deve preencher todo o equipo;\n" +
                "5. Controlar o gotejamento no equipo, macrogotas conforme orientação do nutricionista ou enfermeiro, como descrito a seguir: deverão cair X gotas por minuto.\n"},0.88));

        questions.add(new Question(13, new String[]{"como fazer a limpeza da sonda "}
                , new String[]{"Você deve seguir os seguintes passos para a limpeza da sonda \n" +
                "Após a administração de cada dieta injetar 50ml de água (mineral ou fervida) com uma seringa, para evitar o acúmulo de resíduos na seringa.\n" +
                "Fechar a sonda;\n"}, 0.91));

        questions.add(new Question(14, new String[]{"como conseguir a fórmula pelo SUS","Como é feita a solicitação da fórmula pelo SUS-BH"}
                , new String[]{"Para a solicitação da fórmula é necessário que \n" +
                "Usuário ou seu responsável legal deve ir ao Centro de Saúde de referência da residência do solicitante e agendar uma consulta médica para avaliação.\n" +
                "O médico e enfermeiro da Equipe de Saúde da Família (ESF) e o nutricionista do Núcleo de Apoio a Saúde da Família (NASF) de referência deste irão agendar o atendimento. Em caso de identificação da necessidade de fornecimento de fórmulas industrializadas, os profissionais vão preencher um formulário padronizado de solicitação de dieta. A unidade de saúde providenciará o envio do pedido à Secretaria Municipal de Saúde de Belo Horizonte.\n" +
                "A solicitação será avaliada por um grupo de especialistas. A decisão sobre o fornecimento ou não da dieta especial será enviada para a unidade de saúde. Caso o usuário estiver incluído nos critérios para recebimento, ele será inserido no programa e os responsáveis irão até o setor de entrega retirar a dieta mensalmente.\n" +
                "O Centro de Saúde providenciará a comunicação da decisão ao usuário, ou seu responsável.\n"},0.88));


        questions.add(new Question(15, new String[]{"Quais os documentos necessários para o cadastramento"}
                , new String[]{"Para o cadastramento é necessário \n" +
                "Relatório Médico: elaborado em formulário específico por profissional médico da Rede SUS-BH.\n" +
                "Relatório Nutricional: elaborado em formulário específico por profissional da Rede SUS-BH.\n" +
                "Cópia dos documentos de identidade e do cadastro de pessoa física - CPF do paciente.\n" +
                "Cópia do comprovante de residência\n"},0.91));


        questions.add(new Question(16, new String[]{"Quais os documentos necessários para a retirada da fórmula?"}
                , new String[]{"Para o recebimento da fórmula é necessário \n" +
                "Documento original de identidade de quem irá retirar a dieta e o documento original de identidade ou certidão de nascimento do usuário que está cadastrado para receber a dieta.\n" +
                "A cópia dos documentos de identificação não é aceita, sendo aceitos apenas os originais. Qualquer pessoa com o documento original do paciente pode retirar a dieta.\n"},0.88));

        questions.add(new Question(17, new String[]{"De quanto em quanto tempo é preciso renovar o pedido para o recebimento da fórmula?"}
                , new String[]{"O período de validade do pedido é de 04 meses. No 4º mês da liberação, o Centro de Saúde já deverá encaminhar a solicitação de renovação. Para isso, é necessário se dirigir à unidade de saúde e solicitar a renovação. Para que não haja interrupção no fornecimento, é importante solicitar a renovação no início do quarto mês. Os casos são analisados a cada 04 meses, considerando a evolução do quadro clínico do usuário e a sua necessidade de manutenção ou troca do tipo de dieta."},0.88));


        questions.add(new Question(18, new String[]{"Quais as opções de fórmulas prescritas pela nutricionista?", "Quais as opções de fórmulas prescritas", "Quais as opções de fórmulas"}
                , new String[]{"As opções de fórmulas prescritas são as seguintes: \n"}, new String[] {"opcoesformula.png"},0.88));


        questions.add(new Question(19, new String[]{"Qual o diagnóstico nutricional?", "Qual o diagnóstico do paciente?"}
                , new String[]{"O paciente encontra-se em dieta enteral devido ao agravamento da doença de base, IMC de 24,15kg/m2 classificado como eutrófico de acordo com OPAS 2002, porém no exame físico observa-se visivelmente emagrecido, com edemas nos tornozelos e perda de peso de 5kg em 3 dias, exames bioquímicos apontam para hiperglicemia, hipoalbuminemia e níveis elevados de uréia associado a depleção muscular, caracterizando o paciente com desnutrição aguda\n"},0.88));

        questions.add(new Question(20, new String[]{"a sonda está obstruída, o que fazer?", "A sonda entupiu o que faço?", "A sonda está entupida o que faço?"}
                , new String[]{"Para a desobstrução da sonda é necessário \n" +
                "1. Adicionar 20 ml de água temperatura ambiente (fervida ou mineral) com uma seringa, até que desentupa.  \n" +
                "2. a água deve ser colocada lentamente, para evitar que a sonda saia pela pressão da água.\n" +
                "3. se continuar entupida procure atendimento no centro de saúde"},0.88));


        questions.add(new Question(21, new String[]{"Qual a dieta?", "Qual a dieta artesanal?"}
                , new String[]{"Dieta Artesanal Valor calórico de  2000 kcal \n"}, new String[]{"preparacao1.png","preparacao2.png"},0.88));

        questions.add(new Question(22, new String[]{"como fazer a dieta artesanal?"}
                , new String[]{"Modo de preparo da dieta artesanal\n" +
                "Preparação 1 \n" +
                "1. adicionar os ingredientes no liquidificador, bater por 4 min \n" +
                "2. colocar no frasco e guardar no congelador \n\n" +
                "Preparação 2 \n" +
                "1. Cozinhar em uma mesma panela os alimentos crus arroz, carne moída, cebola, cenoura  juntamente com o feijão previamente cozido.\n" +
                "2. Colocar os alimentos cozidos no liquidificador, juntar 2 da porção de água e todos os demais ingredientes da receita e bater por 4 minutos; \n" +
                "3. Colocar a outra metade do água e bater por mais 3 minutos; \n" +
                "4. Coar em peneira fina 3 vezes;\n" +
                "5. Acondicionar na porção superior da geladeira; \n" +
                "\n"},0.88));


        questions.add(new Question(22, new String[]{"Quantas calorias tem a dieta?", "Quantas kcal tem a dieta?"}
                , new String[]{"A dieta possui 1931kcal. "},0.88));


        questions.add(new Question(23, new String[]{"Qual a distribuição dos macronutrientes?"}
                , new String[]{"25% de PTN; 40% LIP (TCM19%; óleo de peixe 19%; 5% lecitina de soja); 35% de CHO ( Maltodextrina 90% e amido de milho 10%)\n "},0.88));

        questions.add(new Question(24, new String[]{"Qual critério de escolha para a fórmula? "}
                , new String[]{"Fórmula parcialmente desidratada, pois a sonda do paciente encontra-se na região pós-pilórica. Hipoglicêmica, para controle da glicemia do paciente acamado. (acho que tá faltando informação ai cê completa, PORFA)\n"},0.88));

        questions.add(new Question(25, new String[]{"O que fazer em casos de diarreia? "}
                , new String[]{"• Caso  receba sucos laxativos (laranja, abacaxi e manga) substituí-los por sucos constipantes (caju, limão, goiaba e maçã, coados)\n" +
                "    • Caso a dieta contenha leite substituí-la por leite com teor reduzido de lactose ou bebida à base de soja. Não acrescentar à dieta alimentos ricos em fibras com canela, farelos e aveia. \n" +
                "    • Administrar a dieta lentamente\n" +
                "    • Verificar a temperatura em que a dieta está sendo administrada. \n" +
                "    • Verificar as técnicas de preparo e conservação da dieta\n" +
                "    • Caso a diarreia não melhore com as medidas acima, procure a nutricionista responsável.\n"},0.95));

        questions.add(new Question(26, new String[]{"O que fazer em caso de vômito?"}
                , new String[]{"Suspenda a dieta até o próximo horário de administração; \n" +
                "    • Verifique a posição do paciente (deve sempre estar posicionado entre 45° e 60°); \n" +
                "    • Administre a dieta lentamente e, se necessário, diminua o volume de infusão; No caso de sonda enteral com acesso pelo nariz (nasoentérica), confira se a marcação do posicionamento da sonda está adequada, ou seja, próxima à narina. \n" +
                "    • Caso a sonda esteja muito exteriorizada, suspenda o próximo horário da dieta e entre em contato com o enfermeiro responsável; \n" +
                "    • Caso os vômitos não cessem, procure seu Centro de Saúde ou serviço de Pronto Atendimento. \n"},0.95));

        questions.add(new Question(27, new String[]{"O que fazer em caso de constipação?"}
                , new String[]{"Ofertar sucos laxativos (laranja, mamão, manga, ameixa).\n" +
                "    • Avaliar se a oferta hídrica diária (água da dieta + água para higienizar a sonda 11 + água para diluir medicamentos) está de acordo com o prescrito. \n" +
                "    • Usar diariamente no preparo da dieta aveia e canela em pó (fontes de fibras).\n" +
                "    • Incentivar a movimentação do paciente saindo da posição deitada para sentado ou de pé. \n" +
                "    • Massagens no abdômen podem auxiliar no processo de evacuação. \n" +
                "    • Caso o usuário não apresente evacuação por até 5 dias, procure o Centro de Saúde ou serviço de Pronto Atendimento\n"},0.95));


        questions.add(new Question(28, new String[]{"O que devo comprar para dieta artesanal?","Lista de compras"}
                , new String[]{"Vou lhe enviar a lista de compras, só um momento."}, new String[]{"listacompras.png"},0.88));


        questions.add(new Question(29, new String[]{"Quais as interações entre remédios e nutrientes ?", "Quais as interações entre fármacos e nutrientes?"}
                , new String[]{"1. Ácido acetilsalicílico (AAS) interação com álcool que pode causar dano na mucosa gastrointestinal e pode prolongar tempo de sangramento.  \n" +
                "2. Atorvastatina: interação com suco de grapefruit que possui componente que impede a ação da CYP3A4 pode do aumentar as concentrações do fármaco. \n" +
                "3. Levotiroxina: pode interagir com farinha de soja, cereais de semente de algodão, nozes e dieta à base de fibras, podendo diminuir a absorção do fármaco. "},0.88));


        questions.add(new Question(30, new String[]{"Qual a quantidade que devo usar de cada ingrediente para dieta artesanal ? ", "Qual a quantidade de cada ingrediente?", "Quantidade de cada ingrediente"}
                , new String[]{"As quantidades de cada ingrediente serão iguais as da imagem a seguir:"}, new String[]{"qnt.png"},0.88));


        questions.add(new Question(27, new String[]{"Exames recentes", "Quais os exames recentes", "Quais os exames bioquimicos recentes"}
                , new String[]{"Os exames mais recentes são estes: "},new String[]{"exames.png"},0.88));

        return questions;
    }
}
