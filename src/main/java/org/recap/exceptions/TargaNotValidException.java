package org.recap.exceptions;


public class TargaNotValidException extends RuntimeException {
//    ... tutti gli attributi e metodi di RunTimeException
    public TargaNotValidException(String targa) {
        super("La targa " + targa + " non e' valida");
    }
}
