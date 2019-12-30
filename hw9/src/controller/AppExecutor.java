package controller;

import task1.ExceptionExample;
import task2.SafeDivision;
import task3.Rethrowing;

public class AppExecutor {
    public void runProgram () {

        //task1
        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.showException();
        exceptionExample.catchExceptionA();
        exceptionExample.catchExceptionB();
        exceptionExample.catchNullPointerException();
        exceptionExample.catchIOException();

        //task2
//        new SafeDivision().division();

        //task3
        try {
            new Rethrowing().someFirstMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
