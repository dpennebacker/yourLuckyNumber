package com.company;

/**
 * Created by ma128 on 10/10/17.
 */
public class numGen {
public double lucky;
public double luckyNum = (int)(Math.random()*100);

public numGen(){

}

public double perfectRandom(){
        lucky = Math.pow(luckyNum, 2);
                return luckyNum;
    }










}
