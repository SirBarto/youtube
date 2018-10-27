package com.example.youtube.controllers;

import com.example.youtube.models.User;
import com.example.youtube.models.UserRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserUpdateController {
    @RequestMapping(method = RequestMethod.PUT,value = "/update/user")

    @ResponseBody
    public String updateUserRecord(@RequestBody User user)
    {
        System.out.println("In updateUserRecord");
        return UserRegistration.getInstance().upDateUser(user);
    }
}
