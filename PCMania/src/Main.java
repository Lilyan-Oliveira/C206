import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Informações  dos sistemas operacionais
        SistemaOperacional linux = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional windows8 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional windows10 = new SistemaOperacional("Windows 10", 64);

        // Informações dos hardwares básicos
        HardwareBasico corei3 = new HardwareBasico("Processador Core i3", 2200);
        HardwareBasico corei5 = new HardwareBasico("Processador Core i5", 3370);
        HardwareBasico corei7 = new HardwareBasico("Processador Core i7", 4500);
        HardwareBasico ram8gb = new HardwareBasico("Memória RAM", 8);
        HardwareBasico ram16gb = new HardwareBasico("Memória RAM", 16);
        HardwareBasico ram32gb = new HardwareBasico("Memória RAM", 32);
        HardwareBasico hd500gb = new HardwareBasico("HD", 500);
        HardwareBasico hd1tb = new HardwareBasico("HD", 1000);
        HardwareBasico hd2tb = new HardwareBasico("HD", 2000);

        // Lista de computadores da promoção
        Computador promo1 = new Computador("Positivo", 3300, linux, corei3, ram8gb, hd500gb);
        Computador promo2 = new Computador("Acer", 8800, windows8, corei5, ram16gb, hd1tb);
        Computador promo3 = new Computador("Vaio", 4800, windows10, corei7, ram32gb, hd2tb);

        // Cliente
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        long cpfCliente = Long.parseLong(entrada.nextLine());
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        // Menu de compras
        boolean comprando = true;
        while (comprando) {
            System.out.println("\nEscolha uma promoção para comprar (1, 2, 3) ou digite 0 para sair:");
            System.out.println("1) Promoção 1 - Positivo (R$3300.00)");
            System.out.println("2) Promoção 2 - Acer (R$8800.00)");
            System.out.println("3) Promoção 3 - Vaio (R$4800.00)");
            int escolha = Integer.parseInt(entrada.nextLine());

            switch (escolha) {
                case 1:
                    cliente.totalCompra += promo1.preco;
                    System.out.println("Compra da Promoção 1 (Positivo) realizada com sucesso!");
                    break;
                case 2:
                    cliente.totalCompra += promo2.preco;
                    System.out.println("Compra da Promoção 2 (Acer) realizada com sucesso!");
                    break;
                case 3:
                    cliente.totalCompra += promo3.preco;
                    System.out.println("Compra da Promoção 3 (Vaio) realizada com sucesso!");
                    break;
                case 0:
                    comprando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        // Mostra informações da compra
        System.out.println("\n----- Informações da Compra -----");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Total da Compra: R$" + cliente.totalCompra);

        entrada.close();
    }
}
