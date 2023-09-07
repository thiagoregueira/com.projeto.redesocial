package com.projeto.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.redesocial.model.Follower;

public interface FollowerRepository extends JpaRepository<Follower, Long> {

}
