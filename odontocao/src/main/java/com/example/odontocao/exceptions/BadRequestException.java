package com.example.odontocao.exceptions;

public class BadRequestException extends Exception{

    public BadRequestException(String message){
        // para trazer uma mensagem de retorno
        super(message);
    }
}
