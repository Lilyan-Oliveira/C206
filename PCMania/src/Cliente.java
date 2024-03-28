class Cliente {
    String nome;
    long cpf;
    float totalCompra;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.totalCompra = 0;
    }

    public float calculaTotalCompra() {
        return totalCompra;
    }
}
