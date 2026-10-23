package dia21.atividade1factory;

public class Main {
    public static void main(String[] args) {

        // a) Thor, banho, 14h, com perfume e laço, sem hidratação, "alérgico a shampoo", 10% de desconto
        Agendamento thor = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .observacao("alérgico a shampoo")
                .desconto(0.1)
                .build();

        // b) Luna, tosa, 10h, sem nenhum extra, sem observação, sem desconto
        // Veja que não precisamos digitar nada para o que é "falso/vazio"! Os booleanos já assumem 'false' por padrão.
        Agendamento luna = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        // c) Mel, banho, 16h, só com hidratação, sem observação, sem desconto
        Agendamento mel = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        // Imprimindo os agendamentos
        thor.mostrar();
        luna.mostrar();
        mel.mostrar();
    }
}
