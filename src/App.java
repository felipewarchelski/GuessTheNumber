import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um codigo de adivinhação de numeros 0 a 10

        /*
        1 - Pedir pro usuario digitar um numero
        2 - Criar um numero aleatorio de 0 a 10
        3 - Se o numero for igual, menor ou maior, mostrar na tela
        */

        System.out.println("Em que número estou pensando?");
        System.out.print("Digite um numero de 0 a 10: ");

        Random r = new Random();
        try (Scanner n = new Scanner(System.in)) {
            int numero = n.nextInt();
            int random = r.nextInt(11);

            int tentativas = 1;                
            while(numero != random) {

                if(numero == random) {
                    System.out.print("Voce acertou");
                    break;
                } else if (numero > random) {
                    System.out.println("O numero é menor que isso!");
                } else {
                    System.out.println("O numero é maior que isso!");
                }
                System.out.println("Tente novamente:");
                numero = n.nextInt();
                tentativas++;
            }
            System.out.println("Você acertou!a");

        
            System.out.println("Número total de tentativas: " + tentativas);

        }
    }
}
