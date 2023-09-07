package com.projeto.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.redesocial.model.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
