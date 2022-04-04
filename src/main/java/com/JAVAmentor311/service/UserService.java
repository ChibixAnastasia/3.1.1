package com.JAVAmentor311.service;

import com.JAVAmentor311.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public interface UserService {
    @Transactional
    void addUser(User user);
    @Transactional
    List<User> getAllUsers();
    @Transactional
    User getUser(Long id);
    @Transactional
    void deleteUser(Long id);
    @Transactional
    void updateUser( User user);

}
