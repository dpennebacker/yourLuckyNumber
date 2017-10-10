package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner kbin = new Scanner(System.in);
        System.out.println("Welcome to my fancy pantsy number generator, please enter your full name below to see your very own lucky number");
        String userName = kbin.nextLine();
        numGen userLucky = new numGen();
        System.out.println("Nice to meet you "+ userName+"! Your lucky number is"+userLucky.perfectRandom()+".\n If you would like another number, please press 2 \nIf you forgot what your name was, please press 1 \nIf you want to leave, press 0.");
        String userResponse = kbin.nextLine();

        if(userResponse.equalsIgnoreCase("0")){
            System.out.println("Ok, CYA");


        } else if (userResponse.equalsIgnoreCase("1")){
            System.out.println("Your name is"+userName+".");


        }


    }
}
