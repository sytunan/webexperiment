package org.example.service.impl;


import org.example.dao.UserDao;
import org.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements org.example.service.UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User validate(String username) {
        return userDao.validate(username);
    }
}
