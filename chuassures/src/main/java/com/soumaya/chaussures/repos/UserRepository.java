package com.soumaya.chaussures.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soumaya.chaussures.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	User findByUsername (String username);
}
	
