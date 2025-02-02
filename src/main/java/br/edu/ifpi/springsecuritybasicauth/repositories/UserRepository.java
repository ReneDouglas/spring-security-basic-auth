package br.edu.ifpi.springsecuritybasicauth.repositories;

import br.edu.ifpi.springsecuritybasicauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
