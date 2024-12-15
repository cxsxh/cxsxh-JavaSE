package com.itheima.a01myexception;

public class Name extends RuntimeException{
    public Name() {
    }

    public Name(String message) {
        super(message);
    }
}
