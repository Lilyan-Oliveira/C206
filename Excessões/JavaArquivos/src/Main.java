import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String frase = "Bora participar da SeComp";
        int deslocamento = 5;
        String nomeArquivo = "textoCriptografado.txt";

        //Parte para escrever o arquivo!
        StringBuilder textoCriptografado = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            textoCriptografado.append((char)(frase.charAt(i) + deslocamento));
        }

        Path arquivo = Paths.get(nomeArquivo);

        try {
            //Java11
            Files.writeString(arquivo, textoCriptografado);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println(textoCriptografado.toString());

        //Leitura do arquivo
        StringBuilder textDescriptografado = new StringBuilder();
        String fraseSalvoArquivo = null;

        try {
            //Java 11
            fraseSalvoArquivo = Files.readString(arquivo);
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        for (int i = 0; i < fraseSalvoArquivo.length(); i++) {
            textDescriptografado.
                    append((char)(fraseSalvoArquivo.charAt(i) - deslocamento));
        }

        System.out.println(fraseSalvoArquivo);
        System.out.println(textDescriptografado.toString());

    }

}