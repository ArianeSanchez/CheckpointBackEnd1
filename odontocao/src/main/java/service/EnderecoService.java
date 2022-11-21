package service;

import .model.Endereco;
import .repository.IDao;
import org.springframework.stereotype.Service;

import java.util.List;

public class EnderecoService {
    private IDao<Endereco> enderecoDao;

    public EnderecoService(IDao<Endereco> enderecoDao) {
        this.enderecoDao = enderecoDao;
    }
    public Endereco salvar(Endereco d){
        enderecoDao.salvar(d);
        return d;
    }
    public Endereco buscar(Integer id){
        return enderecoDao.buscar(id);
    }
    public List<Endereco> buscarTodos(){
        return enderecoDao.buscarTodos();
    }
    public void deletar(Integer id){
        enderecoDao.deletar(id);
    }
}
