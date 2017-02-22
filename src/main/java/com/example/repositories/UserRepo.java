package com.example.repositories;

import com.example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ratchsit.amo on 2/11/2017 AD.
 */
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findById(int id);
}
