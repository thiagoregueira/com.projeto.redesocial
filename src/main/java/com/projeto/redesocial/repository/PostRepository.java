package com.projeto.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.redesocial.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
