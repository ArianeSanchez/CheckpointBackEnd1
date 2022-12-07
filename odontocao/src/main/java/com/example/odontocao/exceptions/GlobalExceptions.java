package com.example.odontocao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//este controller que faz o tratamento de todos os erros
@ControllerAdvice
public class GlobalExceptions {
    //para funcionar no spring boot tem que implementar um método para pegar o erro e fazer um responseentity

    @ExceptionHandler
    public ResponseEntity<String> processarErrorNotFound(ResourceNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage()+"Global");
    }
}
