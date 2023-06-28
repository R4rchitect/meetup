package com.teamra.hexagonalapp.application.impl;

import org.springframework.stereotype.Service;

import com.teamra.hexagonalapp.application.IUserService;
import com.teamra.hexagonalapp.domain.model.User;
import com.teamra.hexagonalapp.domain.repository.IUserRepository;

@Service
public class UserService implements IUserService {

    public final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Integer id) {
        return userRepository.findByIdUser(id);
    }
    
}
