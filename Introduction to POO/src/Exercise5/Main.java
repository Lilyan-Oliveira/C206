public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();

        p1.pontos = 90;
        p2.pontos = 85;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.descricao = "Artorias Greatsword";
        arma2.descricao = "Twinblades";

        arma1.resistencia = 100;
        arma2.resistencia = 90;

        p1.arma = arma1;
        p2.arma = arma2;

        System.out.println("Vida do Personagem 1: " + p1.pontos);

        p1.tomarDano();

        System.out.println("Vida do Personagem apos tomar dano: " + p1.pontos);

        System.out.println("Info da Arma do Personagem 2");
        p2.arma.mostraInfoArma();
        p2.usarArma();
        System.out.println("Usou a Arma");
        System.out.println("Nova Info");
        p2.arma.mostraInfoArma();

    }
}