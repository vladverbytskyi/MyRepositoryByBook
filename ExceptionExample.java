package task1;

import java.io.IOException;

public class ExceptionExample {
    public void showException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void catchExceptionA() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }
    }

    public void catchExceptionB() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB exceptionB) {
            exceptionB.printStackTrace();
        }
    }

    public void catchNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }

    public void catchIOException() {
        try {
            throw new IOException();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
