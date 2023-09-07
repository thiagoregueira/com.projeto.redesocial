package com.projeto.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.redesocial.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
