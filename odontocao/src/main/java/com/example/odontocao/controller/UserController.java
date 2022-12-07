package com.example.odontocao.controller;

import com.example.odontocao.model.User;
import com.example.odontocao.exceptions.BadRequestException;
import com.example.odontocao.exceptions.ResourceNotFoundException;
import com.example.odontocao.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> salvar(@RequestBody User user)throws BadRequestException{
        return ResponseEntity.ok(userService.salvar(user));
    }

    @GetMapping
    public List<User> buscarTodos(){
        return userService.buscarTodos();
    }

    @GetMapping("/{userName}")
    public ResponseEntity<User> buscarUser(@PathVariable String userName) throws ResourceNotFoundException{
        try{
            return ResponseEntity.ok((User) userService.buscarPorUserName(userName));
        }catch(Exception e){
            throw new ResourceNotFoundException("Não foi encontrado o usuário que você quis buscar pelo user name: "+userName);
        }
    }

    @PutMapping
    public ResponseEntity<User> atualizarUser(@RequestBody User user){
        return ResponseEntity.ok(userService.atualizar(user));
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity deletar(@PathVariable String userName) throws ResourceNotFoundException{
        try{
            userService.deletar(userName);
            return ResponseEntity.ok("Deletado");
        }catch(Exception e){
            throw new ResourceNotFoundException("Não foi encontrado o usuário para deletar: "+userName);
        }
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> processarErrorBadRequest(BadRequestException ex){

        //essa classe vai pegar o erro para nós e reportar para o ResponseEntity
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
