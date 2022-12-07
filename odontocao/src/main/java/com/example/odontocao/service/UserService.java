package com.example.odontocao.service;

import com.example.odontocao.model.User;
import com.example.odontocao.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User salvar(User user){
        return userRepository.save(user);
    }

    public List<User> buscarTodos(){
        return userRepository.findAll();
    }

    public Object buscarPorUserName(String userName){
        return (User) userRepository.findByUserName(userName).get();
    }

    public User atualizar(User user){
        return userRepository.saveAndFlush(user);
    }

    //Fazemos o tratamento de exceção exatamente no deletar
    public void deletar(String userName){
        userRepository.deleteByUserName(userName);
    }

}
