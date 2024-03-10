package Example;

public class Conta {

    //Membros da classe
    int numero;
    String nomeDoDono;
    float saldo;
    float limite;

    //Metodo para depositar
    void deposita(float quantia) {

        saldo += quantia;
    }

    //Metodo para sacar
    void saca(float quantia) {

        float novoSaldo = saldo - quantia;
        saldo = novoSaldo;
    }

    //Método para sacar dinheiro
    void transferir(Conta contaDestino, float quantia) {

        saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
