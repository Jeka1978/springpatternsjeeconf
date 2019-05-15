package com.naya.exception_handling;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
