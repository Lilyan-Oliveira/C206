package RedesSociais;

import Exceções.EmailException;
import Exceções.SenhaException;

import java.util.HashSet;

public class Usuario extends RedeSocial {
    private String nome;
    private String email;
    public HashSet<RedeSocial> redesSociais;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Usuario(String nome, String email, String senha, RedeSocial[] redesSociais) throws SenhaException {
        this.nome = nome;
        setEmail(email);
        if (senha.length() >= 4){
            this.senha = senha;
        }
        else throw new SenhaException("Senha muito curta");

        this.redesSociais = new HashSet<>();
        for (RedeSocial redeSocial : redesSociais) {
            this.redesSociais.add(redeSocial);
        }
    }

    private void setEmail(String email) {
        if (!email.contains("@")) {
            throw new EmailException("Email inválido!");
        }
        this.email = email;
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário!");
    }
}

