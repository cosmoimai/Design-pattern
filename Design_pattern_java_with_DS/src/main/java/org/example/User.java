package org.example;

public class User {
    int val;
    private String name;
    User(String name)
    {
        this.name = name;
    }
    public void walk(){
        System.out.println("Walking at speed of 5");
    }
}
