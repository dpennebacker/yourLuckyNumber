package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	Scanner kbin = new Scanner(System.in);
	int userExit=0;

        System.out.println("Press enter to initialize the System...");
        while(userExit == 0) {

        String BufferResponse = kbin.nextLine();

        System.out.println("Please enter your full name below to see your very own lucky number");
        String userName = kbin.nextLine();

        numGen userLucky = new numGen();
        System.out.println("Nice to meet you " + userName + "! Your lucky number is " + userLucky.perfectRandom() + ".\n If you would like another number, please press 2 \n If you forgot what your name was, please press 1 \n If you want to leave, press 0.");

        int userResponse = kbin.nextInt();

	    if(userResponse == 1){
            System.out.println("Your name is "+userName+". And your lucky number is "+userLucky.perfectRandom()+".");

        }
	    else if(userResponse == 2){


        }
        else if(userResponse == 0){
	        userExit = 1;
        }







	}




    }
}
