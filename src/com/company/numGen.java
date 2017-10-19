package com.company;


public class numGen {
public double lucky;
public double luckyNum = (int)(Math.random()*100);
//I don't see the need for this
public numGen(){

}

public double perfectRandom(){
        lucky = Math.pow(luckyNum, 2);
                return lucky;
    }










}
