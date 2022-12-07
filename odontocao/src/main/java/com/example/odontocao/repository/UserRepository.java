package com.example.odontocao.repository;

import com.example.odontocao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    ThreadLocal<Object> findByUserName(String userName);

    void deleteByUserName(String userName);
}
