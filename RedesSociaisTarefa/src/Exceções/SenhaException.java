package Exceções;

import java.io.IOException;

//Checada
public class SenhaException extends IOException {
    public SenhaException(String message) {
        super(message);
    }
}

