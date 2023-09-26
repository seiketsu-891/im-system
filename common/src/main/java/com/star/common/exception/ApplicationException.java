package com.star.common.exception;

public class ApplicationException extends RuntimeException {
    private final int code;
    private final String error;

    public ApplicationException(int code, String message){
        super(message);
        this.code = code;
        this.error = message;
    }

    public ApplicationException(ApplicationExceptionEnum exceptionEnum){
        super(exceptionEnum.getError());
        this.code = exceptionEnum.getCode();
        this.error  = exceptionEnum.getError();
    }

    public int getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

    /**
     *  avoid the expensive and useless stack trace for api exception
     */
    @Override
    public Throwable fillInStackTrace(){
        // disable the default behavior of capturing and storing the stack trace when an exception is thrown
        // return the current instance of the exception object itself
        return this;
    }
}
