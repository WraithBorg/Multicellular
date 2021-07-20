package com.ac.auth.response;

public class TokenAuthenticationException extends RuntimeException {

    public TokenAuthenticationException() {
        super();
    }

    public TokenAuthenticationException(int code, String message) {
        super(code + message);
    }
}
