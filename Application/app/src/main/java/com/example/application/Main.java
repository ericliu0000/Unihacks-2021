package com.example.application;

import com.example.application.ui.exercises.Cardio;
import com.example.application.ui.exercises.Muscle;

class Main {
    public static void main(String[] args) {
        Cardio x = new Cardio(5);
        System.out.println(x.getType());

        Muscle y = new Muscle(5, "chest", 50);

    }
}