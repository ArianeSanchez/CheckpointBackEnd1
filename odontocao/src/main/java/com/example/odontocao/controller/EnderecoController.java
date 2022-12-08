package com.example.odontocao.controller;
import com.example.odontocao.exceptions.BadRequestException;
import com.example.odontocao.exceptions.ResourceNotFoundException;
import com.example.odontocao.model.Endereco;
import com.example.odontocao.model.User;
import com.example.odontocao.service.EnderecoService;
import com.example.odontocao.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService enderecoService;


    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping
    public ResponseEntity<Endereco> salvar(@RequestBody Endereco endereco)throws BadRequestException {
        return ResponseEntity.ok(enderecoService.salvar(endereco));
    }

    @GetMapping
    public List<Endereco> buscarTodos(){
        return enderecoService.buscarTodos();
    }



    @GetMapping("/{enderecoId}")
    public ResponseEntity<Endereco> buscarEndereco(@PathVariable Integer id) throws ResourceNotFoundException {
        try{
            return ResponseEntity.ok((Endereco) enderecoService.buscar(id));
        }catch(Exception e){
            throw new ResourceNotFoundException("Não foi encontrado o endereço que você quis buscar pelo id: "+ id    );
        }
    }

    @PutMapping
    public ResponseEntity<Endereco> atualizarEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.ok(enderecoService.atualizar(endereco));
    }



    @DeleteMapping("/{deleteEndereco}")
    public ResponseEntity deletar(@PathVariable Integer id) throws ResourceNotFoundException{
        try{
            enderecoService.deletar(id);
            return ResponseEntity.ok("Deletado");
        }catch(Exception e){
            throw new ResourceNotFoundException("Não foi encontrado o endereço para deletar: "+ id);
        }
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> processarErrorBadRequest(BadRequestException ex){

        //essa classe vai pegar o erro para nós e reportar para o ResponseEntity
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }




}
