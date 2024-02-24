import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3f;

        System.out.println("Total de lanches: "+total);
        System.out.println("Média dos lanches: "+media);
    }
}