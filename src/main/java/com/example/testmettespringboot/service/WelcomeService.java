package com.example.testmettespringboot.service;

import com.example.testmettespringboot.model.Message;
import com.example.testmettespringboot.repository.WelcomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WelcomeService {


    private WelcomeRepository welcomeRepository;


    public WelcomeService(WelcomeRepository welcomeRepository){
        this.welcomeRepository = welcomeRepository;
    }

    public List<Message> getAllMessages(){
        return welcomeRepository.getList();
    }

    public String getMessageById(int id){
        return welcomeRepository.getMessage(id);
    }

}
