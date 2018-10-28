package com.example.youtube.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerController {
    @RequestMapping("/getExample")
   // @ResponseBody //if we using RestController we dont ned responsebody in code
    public String purchase()
    {
        return "example testing";
    }
}
