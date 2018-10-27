package com.example.youtube.controllers;

import com.example.youtube.models.UserRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserDeleteController {
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/user/{user_nr}")

    @ResponseBody
    public String deleteUserRecord(@PathVariable("user_nr")String user_nr){
        System.out.println("In deleteUserRecord");
            return UserRegistration.getInstance().deleteUser(user_nr);
    }
}
