package com.example.demo.therepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ModelLogin;


public interface RepoLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByuname(String uname);
	
}
