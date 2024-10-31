package com.charm.AgarkovSpringSecurtiyApp.repository;

import com.charm.AgarkovSpringSecurtiyApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
