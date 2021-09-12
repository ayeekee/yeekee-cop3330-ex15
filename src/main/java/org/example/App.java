package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Set your username: ");
        String setUser = se.nextLine();

        System.out.print("Set your password: ");
        String setPass = se.nextLine();

        System.out.print("What is your username? ");
        String username = se.nextLine();

        System.out.print("What is the password? ");
        String password = se.nextLine();

        if (password.equals(setPass)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
