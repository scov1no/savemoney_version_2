package com.savemoney.savemoney.Resources;

import java.util.List;
import java.util.Optional;

import com.savemoney.savemoney.Entities.User;
import com.savemoney.savemoney.Repositories.UserRepository;
import com.savemoney.savemoney.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {

    @Autowired
    private UserRepository  userRepository;

    private ResponseEntity<User> responseEntity;




}
