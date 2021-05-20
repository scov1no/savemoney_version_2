package com.example.backend_savemoney_test.repository;

import com.example.backend_savemoney_test.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuario_repository extends JpaRepository<Usuario, Integer> {

    public Usuario findById(long id);

}
