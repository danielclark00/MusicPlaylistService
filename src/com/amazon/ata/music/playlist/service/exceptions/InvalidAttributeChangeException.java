package com.amazon.ata.music.playlist.service.exceptions;

public class InvalidAttributeChangeException extends InvalidAttributeException {
    private static final long serialVersionUID = -3366726622634033091L;

    public InvalidAttributeChangeException() {
    }

    public InvalidAttributeChangeException(String message) {
        super(message);
    }

    public InvalidAttributeChangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAttributeChangeException(Throwable cause) {
        super(cause);
    }
}
