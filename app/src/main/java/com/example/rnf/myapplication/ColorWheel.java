package com.example.rnf.myapplication;

import java.util.Random;

/**
 * Created by rnf on 22/09/14.
 */
public class ColorWheel {

    String[] mColors ={
            "#39add1",
            "#4079ab"
    };

    public  String getColor(){

        Random randomGenerator= new Random();
        int randomNumber=randomGenerator.nextInt(mColors.length);
        String fact= mColors[randomNumber];
        return fact;
    }
}
