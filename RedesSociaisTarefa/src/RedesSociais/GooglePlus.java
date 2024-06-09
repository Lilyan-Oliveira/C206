package RedesSociais;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no GooglePlus!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" no Google Plus!");
    }
}

