package com.example.application;

import com.example.application.Cardio;
import com.example.application.Muscle;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Cardio x = new Cardio(5);
        System.out.println(x.getType());

        Muscle y = new Muscle(5, "chest", 50);

    }
}