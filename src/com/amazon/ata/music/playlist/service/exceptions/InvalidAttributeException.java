package com.amazon.ata.music.playlist.service.exceptions;

public class InvalidAttributeException extends RuntimeException {
    private static final long serialVersionUID = 3691698786955951994L;

    public InvalidAttributeException() {
    }

    public InvalidAttributeException(String message) {
        super(message);
    }

    public InvalidAttributeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAttributeException(Throwable cause) {
        super(cause);
    }
}
