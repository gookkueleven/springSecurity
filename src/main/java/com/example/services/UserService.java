package com.example.services;

import com.example.entities.UserEntity;
import com.example.models.UserModel;
import com.example.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ratchsit.amo on 2/11/2017 AD.
 */
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<UserEntity> getAll(){
        return userRepo.findAll();
    }

    public UserEntity getById(int id){
        return (UserEntity) userRepo.findById(id);
    }

//    @Secured("ROLE_ADMIN")
    public UserEntity createTest(UserModel testModel){
        UserEntity userEntity = new UserEntity();
        userEntity.setUser(testModel.getUser());
        userEntity.setPass(testModel.getPass());
        UserEntity result = userRepo.saveAndFlush(userEntity);

        return result;
    }
}
