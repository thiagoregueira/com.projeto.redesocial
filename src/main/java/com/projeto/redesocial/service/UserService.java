package com.projeto.redesocial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.redesocial.model.User;
import com.projeto.redesocial.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public void delete(long id) {
        User user = new User();
        user.setId(id);
        userRepository.delete(user);
    }

    public User update(Long id, User user) {
        User userFound = findById(id);
        if (userFound != null) {
            return userRepository.save(user);
        } else {
            return user;
        }
    }
}
