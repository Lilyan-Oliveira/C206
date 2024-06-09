package Exceções;

//Não checada
public class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }
}
