package com.blogpessoal.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogpessoal.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
}
