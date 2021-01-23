package com.example.application;

public class Muscle extends Goal {
    private int reps;

    public Muscle(int freq, String gr, int m) {
        super(freq, "Muscle-Building", gr, m);
        System.out.println("Muscle object created");
    }

    public void setReps(int r) {
        reps = r;
    }

    public void setMilestone(int stone) {
        super.setMilestone(stone);
        setReps(calcRep(stone));
    }

    public int getReps() {
        return reps;
    }


    public void checkGoal() { //to see if the goal was reached for the  last milestone
        if (this.getReps() >= this.getGoal()) {
            System.out.println("goal reached"); //needs some sort of setter
        }
    }
}