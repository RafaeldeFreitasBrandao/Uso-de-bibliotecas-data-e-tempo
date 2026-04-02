import java.util.Scanner;

public class Main {
    public static void main (String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("TDE 02: Biblioteca Padrão para Data e Tempo\n");


        System.out.println("Como vai o programa vai funcionar?\n" +
                "passo(1): Exibição da data e horário atuais\n" +
                "passo(2): Input do tempo N (em segundos)\n" +
                "passo(3): Resultado do cálculo do tempo\n");


        System.out.println("Digite '1' para continuar: ");
        int confirmar = teclado.nextInt();

        while (confirmar != 1) {
            System.out.println("Digite um valor válido: ");
            confirmar = teclado.nextInt();
        }

        //chama o método que mostra a data atual
        Data_Atual exibir = new Data_Atual();
        exibir.mostrar();

        //armazena o tempo em segundos
        System.out.println("Digite o valor do tempo em segundos: ");
        int tempo = teclado.nextInt();

        //chama o método que calcula o tempo
        Calcular_Tempo calculo = new Calcular_Tempo();
        calculo.calcular_dia(tempo);
    }
}