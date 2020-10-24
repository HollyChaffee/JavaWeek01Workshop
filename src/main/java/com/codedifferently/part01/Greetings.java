package com.codedifferently.part01;


import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name");
        String name = scanner.next();
        if (name.equals("Hakim") || name.equals("Rasheeda")) {
            System.out.println("Hello");
        }

    }
}
