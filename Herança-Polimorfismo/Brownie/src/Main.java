import Brownie.BrownieCafe;
import Brownie.BrownieDoceDeLeite;
import Brownie.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceDeLeite bwDoceLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");

        bwNutella.adicionaNutella();
        bwCafe.adicionaCafe();
        bwDoceLeite.adicionaDoceDeLeite();
        System.out.println(" ");
        bwCafe.mostraInfo();
        bwDoceLeite.mostraInfo();
        bwNutella.mostraInfo();
        System.out.println(" ");
        bwNutella.addCarrinhoDeCompras();
        bwNutella.calculaValorTotalCompra();
        bwCafe.calculaValorTotalCompra();
        bwDoceLeite.calculaValorTotalCompra();
        bwCafe.addCarrinhoDeCompras();
        bwNutella.addCarrinhoDeCompras();
        bwDoceLeite.addCarrinhoDeCompras();

        Comprador comprador = new Comprador("Comprador", 1000.95);

        comprador.efetuarCompra(bwCafe);
        comprador.efetuarCompra(bwNutella);
        comprador.efetuarCompra(bwDoceLeite);

    }
}