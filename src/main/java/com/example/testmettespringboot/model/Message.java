package com.example.testmettespringboot.model;


public class Message {
    private int id;
    private String text;

    public Message(){

    }

    public Message(int id, String name){
        this.id = id;
        this.text = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText(){
        return text;
    }


}
