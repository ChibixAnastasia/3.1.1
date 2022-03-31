package com.JAVAmentor311.service;

import com.JAVAmentor311.model.User;
import com.JAVAmentor311.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id){
        return userRepository.getById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void addUser(String name, int age) {
        this.userRepository.save(new User(name, age));
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user.getId(), user.getName(), user.getAge());
    }



   /* private UserDaoImpl userDao;

    @Autowired
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(String name, int age) {
        this.userDao.addUser(name, age);
    }

    @Override
    @Transactional
    public void addUser(User user){
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return this.userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        this.userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser( User user) {
        this.userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void updateUser(String name, int age, long id) {
        this.userDao.updateUser(name, age, id);
    }*/
}
