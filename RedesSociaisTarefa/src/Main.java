import Exceções.SenhaException;
import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;
import RedesSociais.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            RedeSocial[] redes = {new Facebook(), new Instagram(), new GooglePlus(), new Twitter()};
            Usuario usuario1 = new Usuario("Lilyan", "lilyan.oliveira@ges.inatel.br", "123456", redes);

            //Teste da exceção do email: retirado o @
            //Usuario usuario1 = new Usuario("Lilyan", "lilyan.oliveirages.inatel.br", "123456", redes);
            //Teste da exceção da senha: senha menor ou igual a 4 caracteres
            //Usuario usuario1 = new Usuario("Lilyan", "lilyan.oliveira@ges.inatel.br", "123", redes);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo, " + usuario1.getNome());

            while (true) {

                System.out.println("Escolha uma rede social para usar: ");
                System.out.println("1. Facebook");
                System.out.println("2. Instagram");
                System.out.println("3. Twitter");
                System.out.println("4. Google+");
                System.out.println("0. Sair");
                int escolhaRede = scanner.nextInt();

                if (escolhaRede == 0) {
                    System.out.println("Obrigado por utilizar os nossos serviços, " +usuario1.getNome() + ", até mais!");
                    break;
                }

                RedeSocial redeEscolhida = null;
                switch (escolhaRede) {
                    case 1:
                        redeEscolhida = new Facebook();
                        break;
                    case 2:
                        redeEscolhida = new Instagram();
                        break;
                    case 3:
                        redeEscolhida = new Twitter();
                        break;
                    case 4:
                        redeEscolhida = new GooglePlus();
                        break;
                    default:
                        System.out.println("Escolha inválida.");
                        continue;
                }

                while (true){
                    System.out.println("Escolha uma ação:");
                    System.out.println("1. Postar Foto");
                    System.out.println("2. Postar Vídeo");
                    System.out.println("3. Postar Comentário");
                    System.out.println("4. Curtir Publicação");

                    if (redeEscolhida instanceof VideoConferencia) {
                        System.out.println("5. Fazer Streaming");
                    }
                    if (redeEscolhida instanceof Compartilhamento) {
                        System.out.println("6. Compartilhar");
                    }

                    System.out.println("0. Voltar ao menu anterior");
                    int escolhaAcao = scanner.nextInt();
                    if (escolhaAcao == 0)
                        break;
                    switch (escolhaAcao) {
                        case 1:
                            System.out.print(usuario1.getNome() + " ");
                            redeEscolhida.postarFoto();
                            break;
                        case 2:
                            System.out.print(usuario1.getNome() + " ");
                            redeEscolhida.postarVideo();
                            break;
                        case 3:
                            System.out.print(usuario1.getNome() + " ");
                            redeEscolhida.postarComentario();
                            break;
                        case 4:
                            System.out.print(usuario1.getNome() + " ");
                            redeEscolhida.curtirPublicacao();
                            break;
                        case 5:
                            if (redeEscolhida instanceof VideoConferencia) {
                                System.out.print(usuario1.getNome() + " ");
                                ((VideoConferencia) redeEscolhida).fazStreaming();
                            } else {
                                System.out.println("Ação inválida.");
                            }
                            break;
                        case 6:
                            if (redeEscolhida instanceof Compartilhamento) {
                                System.out.print(usuario1.getNome() + " ");
                                ((Compartilhamento) redeEscolhida).compartilhar();
                            } else {
                                System.out.println("Ação inválida.");
                            }
                            break;
                        default:
                            System.out.println("Ação inválida.");
                            break;
                    }
                }
            }
            scanner.close();
        } catch (SenhaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
