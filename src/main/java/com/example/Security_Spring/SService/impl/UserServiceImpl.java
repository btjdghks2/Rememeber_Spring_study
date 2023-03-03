package com.example.Security_Spring.SService.impl;

import com.example.Security_Spring.SRepository.SecurityRepository;
import com.example.Security_Spring.SService.UserService;
import com.example.Security_Spring.Security_Entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SecurityRepository securityRepository;

    @Transactional
    @Override
    public void createUser(BaseEntity baseEntity) {

        securityRepository.save(baseEntity);

    }
}
