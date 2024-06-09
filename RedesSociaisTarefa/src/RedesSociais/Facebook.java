package RedesSociais;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" no Facebook!");
    }
}

