package com.charm.AgarkovSpringSecurtiyApp.repository;

import com.charm.AgarkovSpringSecurtiyApp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
