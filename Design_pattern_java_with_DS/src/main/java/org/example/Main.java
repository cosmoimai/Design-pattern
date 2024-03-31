package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "ashu";
        Scanner myObj = new Scanner(System.in);
        String username = myObj.nextLine();
        System.out.println(username);
        Customer u = new Customer(s);
        System.out.println(u);
        u.walk(19);
        System.out.println("Hello world!");
    }
}