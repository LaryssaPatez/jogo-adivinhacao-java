import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); //gerar números aleatórios entre 1 e 100
        int tentativas = 0;

        //loop
        while (tentativas < 5) {
            int tentativasRestantes = 5 - tentativas;
            System.out.println("Digite um número de 0 a 100, você tem " +tentativasRestantes+ " tentativas!");
            int numeroDigitado = leitor.nextInt();
            tentativas ++;

            if(numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " +tentativas+ " tentativas!");
                break; //interrompe loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }

            if (tentativas == 5) {
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número gerado era " + numeroGerado);
            }
        }

    }
}