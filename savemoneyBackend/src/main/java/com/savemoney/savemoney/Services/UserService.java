package com.savemoney.savemoney.Services;

import java.util.List;
import java.util.Optional;

import com.savemoney.savemoney.Entities.User;
import com.savemoney.savemoney.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    
}
