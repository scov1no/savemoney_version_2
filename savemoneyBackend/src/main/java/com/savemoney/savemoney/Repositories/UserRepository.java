package com.savemoney.savemoney.Repositories;

import com.savemoney.savemoney.Entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}