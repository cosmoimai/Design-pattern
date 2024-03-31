package org.example;

public class Customer extends User{
    Customer(String s)
    {
        super(s);
    }

    @Override
    public void walk() {
        System.out.println("customer walking at speed of 10");
    }
    public void walk(int speed){
        System.out.println("customer walking at speed of " + speed);
    }
}
