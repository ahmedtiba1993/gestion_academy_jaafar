package com.academy.academy.exception;
public enum ErrorCodes {

    /*Matiere*/
    MATIERE_NOT_VALID(100),
    MATIERE_NOT_FOUND(101), BAD_CREDENTIALS(102);
    private int code;

    ErrorCodes(int code){
        this.code=code;
    }
    public int getCode() {
        return code;
    }

}
