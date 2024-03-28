import java.util.ArrayList;
import java.util.List;

class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico processador;
    HardwareBasico memoriaRAM;
    HardwareBasico hd;
    List<MemoriaUSB> memoriasUSB;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional,
                      HardwareBasico processador, HardwareBasico memoriaRAM, HardwareBasico hd) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.hd = hd;
        this.memoriasUSB = new ArrayList<>();
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");
        System.out.println("Processador: " + processador.nome + " - " + processador.capacidade + " MHz");
        System.out.println("Memória RAM: " + memoriaRAM.nome + " - " + memoriaRAM.capacidade + " GB");
        System.out.println("HD: " + hd.nome + " - " + hd.capacidade + " GB");
        System.out.println("Memórias USB adicionadas:");
        for (MemoriaUSB usb : memoriasUSB) {
            System.out.println("- " + usb.nome + " - " + usb.capacidade + " GB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        memoriasUSB.add(musb);
    }
}