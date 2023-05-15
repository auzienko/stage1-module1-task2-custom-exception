package com.epam.mjc;

public class MyCustomException extends IllegalArgumentException{
    public MyCustomException() {
        super();
    }

    public MyCustomException(String s) {
        super(s);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }
}
