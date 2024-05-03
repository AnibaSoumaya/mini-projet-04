package com.soumaya.chaussures.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soumaya.chaussures.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByRole(String role);
}
