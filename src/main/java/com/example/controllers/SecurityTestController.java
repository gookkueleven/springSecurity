package com.example.controllers;

import com.example.entities.UserEntity;
import com.example.models.ResponseModel;
import com.example.models.UserModel;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class SecurityTestController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityTestController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<ResponseModel> testApp(){
        List<UserEntity> result = userService.getAll();
        ResponseModel responseModel = new ResponseModel("recieved", result);
        return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResponseModel> testApp2(@PathVariable("id") int id){
        UserEntity result = userService.getById(id);
        ResponseModel responseModel = new ResponseModel("recieved", result);
        return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<ResponseModel> testPost(@RequestBody UserModel testModel){
        UserEntity result = userService.createTest(testModel);
        ResponseModel responseModel = new ResponseModel("recieved", result);
        return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.ACCEPTED);
    }

}
