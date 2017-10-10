package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner kbin = new Scanner(System.in);
        System.out.println("Welcome to my fancy pantsy number generator, please enter your full name below to see your very own lucky number");
        String userName = kbin.nextLine();
        System.out.println("Nice to meet you "+ userName+"! Your lucky number is"+perfectRandom+".\n If you would like another number, please press 2 \nIf you forgot what your name was, please press 1 \nIf you want to leave, press 0.");


    }
}
