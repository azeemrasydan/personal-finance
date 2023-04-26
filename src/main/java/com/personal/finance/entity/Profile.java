package com.personal.finance.entity;

public class Profile {

    public String id;
    public String name;

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
