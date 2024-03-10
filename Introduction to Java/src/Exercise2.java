import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        //Variáveis que irão salvar o número de lanches consumidos
        int lanche1, lanche2, lanche3;

        System.out.print("Digite o número de lanches consumidos na primeira hora: ");
        lanche1 = entrada.nextInt();
        System.out.print("Digite o número de lanches consumidos na segunda hora: ");
        lanche2 = entrada.nextInt();
        System.out.print("Digite o número de lanches consumidos na terceira hora: ");
        lanche3 = entrada.nextInt();

        //total de lanches
        int total = lanche1 + lanche2 + lanche3;

        //media de lanches
        double media = total/3f;

        System.out.println("Total de lanches consumidos: " + total);
        System.out.println("Media de lanches consumidos: " + media);

        //Para fechar o Scanner, após seu uso
        entrada.close();
    }
}
