package com.example.youtube.controllers;

import com.example.youtube.models.User;
import com.example.youtube.models.UserRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "/user/alluser")

    @ResponseBody
    public List<User>getAllUser(){
        return UserRegistration.getInstance().getUserRecords();
    }
}
