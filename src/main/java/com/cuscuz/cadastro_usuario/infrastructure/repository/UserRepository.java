package com.cuscuz.cadastro_usuario.infrastructure.repository;

import com.cuscuz.cadastro_usuario.infrastructure.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Facilitator of the User Entity
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    @Transactional // annotation to specify - if any error occurs, the email cannot be deleted
    void deleteByEmail(String email);
}
