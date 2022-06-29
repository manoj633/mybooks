package com.mybooks.exceptions;

public class PublisherNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public PublisherNotFoundException() {
        super();
    }

    public PublisherNotFoundException(String message) {
        super(message);
    }
}
