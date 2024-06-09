package RedesSociais;

import Interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no Twitter!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" no Twitter!");
    }
}
