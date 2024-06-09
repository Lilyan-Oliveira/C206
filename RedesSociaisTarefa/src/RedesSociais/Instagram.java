package RedesSociais;

public class Instagram extends RedeSocial {

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Instagram!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" no Instagram!");
    }
}
