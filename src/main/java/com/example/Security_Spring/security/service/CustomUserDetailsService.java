package com.example.Security_Spring.security.service;

import com.example.Security_Spring.SRepository.SecurityRepository;
import com.example.Security_Spring.Security_Entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private SecurityRepository securityRepository;

    @Autowired
    private BaseEntity baseEntity;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        BaseEntity baseEntity = securityRepository.findByUsername(username);

        if(baseEntity == null) {
            throw new UsernameNotFoundException("UsernameNotFoundException");
        }

        return null;
    }
}
