package com.example.odontocao.controller;

import com.example.odontocao.exceptions.BadRequestException;
import com.example.odontocao.exceptions.ResourceNotFoundException;
import com.example.odontocao.model.Dentista;
import com.example.odontocao.model.User;
import com.example.odontocao.service.DentistaService;
import com.example.odontocao.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dentista")

public class DentistaController {

    private final DentistaService dentistaService;


    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @PostMapping
    public ResponseEntity<Dentista> salvar(@RequestBody Dentista dentista)throws BadRequestException {
        return ResponseEntity.ok(dentistaService.salvar(dentista));
    }

    @GetMapping
    public List<Dentista> buscarTodos(){
        return dentistaService.buscarTodos();
    }


    @GetMapping("/{userName}")
    public ResponseEntity<Dentista> buscarDentista(@PathVariable Integer id) throws ResourceNotFoundException {
        try{
            return ResponseEntity.ok((Dentista) dentistaService.buscar(id));
        }catch(Exception e){
            throw new ResourceNotFoundException("Não foi encontrado o usuário que você quis buscar pelo user name: "+  id);
        }
    }



    @PutMapping
    public ResponseEntity<Dentista> atualizarDentista(@RequestBody Dentista dentista){
        return ResponseEntity.ok(dentistaService.atualizar(dentista));
    }



    @DeleteMapping("/{userName}")
    public ResponseEntity deletarDentista(@PathVariable Integer id) throws ResourceNotFoundException{
        try{
            dentistaService.deletar(id);
            return ResponseEntity.ok("Deletado");
        }catch(Exception e){
            throw new ResourceNotFoundException("Não foi encontrado o usuário para deletar: "+ id);
        }
    }



    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> processarErrorBadRequest(BadRequestException ex){

        //essa classe vai pegar o erro para nós e reportar para o ResponseEntity
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

}