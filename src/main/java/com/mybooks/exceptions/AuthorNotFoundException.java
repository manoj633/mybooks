package com.mybooks.exceptions;

public class AuthorNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public AuthorNotFoundException() {
        super();
    }

    public AuthorNotFoundException(String message) {
        super(message);
    }
}
