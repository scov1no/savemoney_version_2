package com.savemoney.savemoney.Services;

import java.util.List;

import com.savemoney.savemoney.model.User;
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

    
}
