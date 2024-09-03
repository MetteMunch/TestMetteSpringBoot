package com.example.testmettespringboot.controller;

import com.example.testmettespringboot.model.Message;
import com.example.testmettespringboot.service.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {


    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    @GetMapping //denne get Endpoint hentes, når der bare skrives /welcome i browseren
    public ResponseEntity<List<Message>> getAllMessages(){
        List<Message> messages = welcomeService.getAllMessages();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/{id}") //denne get Endpoint hentes, når der angives er id i browseren fx welcome/2
    public ResponseEntity<String> getMessageById(@PathVariable int id){
        return new ResponseEntity<String>(welcomeService.getMessageById(id),HttpStatus.OK);

    }


}
