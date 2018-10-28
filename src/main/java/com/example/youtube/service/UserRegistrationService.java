package com.example.youtube.service;

import com.example.youtube.models.User;
import com.example.youtube.models.UserRegistration;
import com.example.youtube.models.UserRegistrationReplay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRegistrationService {
    @RequestMapping(method = RequestMethod.POST, value = "/register/user")

    @ResponseBody
    public UserRegistrationReplay registerUser(@RequestBody User user){
        System.out.println("In registerUser");
        UserRegistrationReplay stdregreply = new UserRegistrationReplay();
        UserRegistration.getInstance().add(user);
        stdregreply.setLogin(user.getLogin());
        stdregreply.setName(user.getName());
        stdregreply.setLastname(user.getLastname());
        stdregreply.setMail(user.getMail());
        stdregreply.setPassword(user.getPassword());
        stdregreply.setRegistrationNumber(user.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");
        return stdregreply;
    }
}
