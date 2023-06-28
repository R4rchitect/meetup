package com.teamra.hexagonalapp.application;

import com.teamra.hexagonalapp.domain.model.User;

public interface IUserService {

    public User findUserById(Integer id);
    
}
