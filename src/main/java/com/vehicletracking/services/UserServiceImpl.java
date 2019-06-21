/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.services;

import com.vehicletracking.dao.UserDAO;
import com.vehicletracking.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author burakzengin
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void save(User u) {
        userDAO.save(u);
    }

    @Override
    public boolean login(String username, String password) {
        User user = userDAO.findByProperty("username", username);
        return user.getPassword().equals(password);
    }

    public User findByProperty(String propName, Object propValue) {
        return userDAO.findByProperty(propName, propValue);
    }

    public void delete(User u) {
        userDAO.delete(u);
    }

}
