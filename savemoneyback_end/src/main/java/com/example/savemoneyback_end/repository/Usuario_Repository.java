package com.example.savemoneyback_end.repository;

import com.example.savemoneyback_end.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuario_Repository extends JpaRepository<Usuario, Long> {
    Usuario findById(long id);
}
