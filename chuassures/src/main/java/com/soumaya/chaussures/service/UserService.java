package com.soumaya.chaussures.service;

import com.soumaya.chaussures.entities.Role;
import com.soumaya.chaussures.entities.User;

public interface UserService {

	void deleteAllusers();
	void deleteAllRoles();
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
