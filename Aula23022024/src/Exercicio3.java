import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        npa = entrada.nextInt();

        if (npa >=60){
            System.out.println("Deu bom!!");
        }
        else {
            System.out.println("Ainda tem como...");
            np3 = entrada.nextInt();

            if ((np3 + npa)/2 >= 50){
                System.out.println("Deu bom!!");
            }
            else {
                System.out.println("Deu ruim...");
            }
        }

        entrada.close();
    }
}
