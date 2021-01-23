package com.example.application;

class Goal {
    private int frequency;
    private String type;
    private String group;
    private int max;
    private int lastMilestone;
    private String exercise; //TODO: need to implement with exercise class/object (make it a selection off of muscle group)

    public Goal(int freq, String ty, String gr, int m) { //frequency is supposed to be an arraylist of days of week but i'm too lazy to implement
        frequency = freq;
        type = ty;
        group = gr;
        max = m;
        System.out.println("goal object created");
    }

    public void setType(String ty) {
        type = ty;
    }

    public void setGroup(String gr) {
        group = gr;
    }

    public void setMax(int m) {
        max = m;
    }

    public void setMilestone(int stone) {
        lastMilestone = stone;
    }
    //TODO: set frequency as a list

    public String getType() {
        return type;
    }

    public String getGroup() {
        return group;
    }

    public int getGoal() {
        return max;
    }

    public int getMilestone() {
        return lastMilestone;
    }
    //TODO: get frequency as a list

    public static int calcRep(int milestone) {
        double s2 = (double) milestone * 1.1;
        System.out.println(s2);
        return Math.max(5 + milestone, (int) s2);
    }
}