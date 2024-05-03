package com.soumaya.chaussures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;   
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import com.soumaya.chaussures.entities.Chaussure;
import com.soumaya.chaussures.entities.Role;
import com.soumaya.chaussures.entities.User;
import com.soumaya.chaussures.service.ChaussureService;
import com.soumaya.chaussures.service.UserService;

import jakarta.annotation.PostConstruct;

import org.thymeleaf.templatemode.TemplateMode;

@SpringBootApplication
public class ChuassuresApplication implements CommandLineRunner {

	@Autowired
	ChaussureService chaussureService;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserService userService;
	
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(ChuassuresApplication.class, args);
	}
	
	  

	@Override
	public void run(String... args) throws Exception {
		//chaussureService.saveChaussure(new Chaussure("Puma", 260.0, new Date()));
		//chaussureService.saveChaussure(new Chaussure("Aldo", 250.0, new Date()));
		//chaussureService.saveChaussure(new Chaussure("Nike", 500.0, new Date()));
		//repositoryRestConfiguration.exposeIdsFor(Chaussure.class);
		//System.out.println("Password Encoded BCRYPT :******************** ");
		//System.out.println(passwordEncoder.encode("123"));
		
		
	}
	/*
	@PostConstruct
	void init_users() {
	//ajouter les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"AGENT"));
	userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null));
	userService.saveUser(new User(null,"soumaya","123",true,null));
	userService.saveUser(new User(null,"user1","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("soumaya", "USER");
	userService.addRoleToUser("soumaya", "AGENT");
	userService.addRoleToUser("user1", "USER");
	}
	 */


}
