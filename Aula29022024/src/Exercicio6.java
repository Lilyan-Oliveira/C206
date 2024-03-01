import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        do {
            //System.out.println(numGerado);
            System.out.println("Qual número estou pensando? ");
            numAdivinhado = entrada.nextInt();

            if (numAdivinhado != numGerado){
                if (numAdivinhado > numGerado){
                    System.out.println("Errou, é um número menor");
                }
                else
                    System.out.println("Errou, é um número maior");
            }
        } while (numGerado != numAdivinhado);
        System.out.println("Acertou!");

        entrada.close();
    }
}
