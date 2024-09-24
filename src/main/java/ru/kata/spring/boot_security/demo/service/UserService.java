package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void add(User user);
    List<User> listUsers();
    User findById(long id);
    void update(User user);
    void deleteById(long id);
    User showAuthorizedUser();
}
