package com.microservice.authentification.repository;

import com.microservice.authentification.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
//    Optional<UserEntity> findByUserName(String userName);
    Optional<UserEntity> findByUsername(String username);
}
