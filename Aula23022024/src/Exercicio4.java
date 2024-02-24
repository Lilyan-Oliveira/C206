import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        Scanner alunos = new Scanner(System.in);
        System.out.println("Quantos alunos serão?  ");
        int num_alunos = alunos.nextInt();

        switch (num_alunos){

            case 10:
            case 20:
                System.out.println("Usar a sala l-16");
            break;

            case 30:
                System.out.println("Usar a sala l-22");
            break;

            default:
                System.out.println("Nenhuma sala escolhida");
        }

        alunos.close();
    }
}
