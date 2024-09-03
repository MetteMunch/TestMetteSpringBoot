package com.example.testmettespringboot.repository;

import com.example.testmettespringboot.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeRepository {
    private int messageId = 1;
    private List<Message> messages;


    public WelcomeRepository() {
        messages = new ArrayList<>();
        addMessages();

    }

    public int getMessageId() {
        return messageId++;
    }

    private void addMessages() {
        messages.add(new Message(getMessageId(), "hej nummer 1"));
        messages.add(new Message(getMessageId(), "hej nummer 2"));
        messages.add(new Message(getMessageId(), "hej nummer 3"));
    }

    public List<Message> getList() {
        return messages;
    }

    public String getMessage(int id){
        String result = "";
        for(Message m : messages){
            if(m.getId() == id){
                result = m.getText();

            }
        }
        return result;
    }

}
