package com.example.rnf.myapplication;

import android.widget.Toast;

import java.util.Random;

/**
 * Created by rnf on 22/09/14.
 */
public class FactBook {

    String[] mFacts ={
            "Ostriches can run faster than horses.",
            "fact 1",
            "fact 2",
            "fact 3",
            "fact 4",
            "fact 5"
    };

    public  String getFact(){

        Random randomGenerator= new Random();
        int randomNumber=randomGenerator.nextInt(mFacts.length);
        String fact= mFacts[randomNumber];

        return fact;
    }
}
