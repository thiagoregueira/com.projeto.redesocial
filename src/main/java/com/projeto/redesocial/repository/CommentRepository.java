package com.projeto.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.redesocial.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
