package com.example.Security_Spring.SRepository;

import com.example.Security_Spring.Security_Entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<BaseEntity, Long> {

    BaseEntity findByUsername(String username);
}
