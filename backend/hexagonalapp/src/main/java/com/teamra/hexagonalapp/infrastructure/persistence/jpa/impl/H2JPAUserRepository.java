package com.teamra.hexagonalapp.infrastructure.persistence.jpa.impl;

import org.springframework.stereotype.Component;

import com.teamra.hexagonalapp.domain.model.User;
import com.teamra.hexagonalapp.domain.repository.IUserRepository;
import com.teamra.hexagonalapp.infrastructure.persistence.jpa.IH2JPAUserRepository;
import com.teamra.hexagonalapp.infrastructure.persistence.jpa.UserEntity;

@Component
public class H2JPAUserRepository implements IUserRepository {
    
        public final IH2JPAUserRepository userRepository;

    public H2JPAUserRepository(IH2JPAUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findByIdUser(Integer id) {
        UserEntity userEntity = userRepository.findByIdUser(id);
        return userEntity.toUser();
    }

}
