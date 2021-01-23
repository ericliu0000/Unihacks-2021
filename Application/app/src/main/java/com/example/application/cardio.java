class cardio extends goal{ //TODO: need to decide how the cardio object checks goals - or if it does?
    private int time;
    public cardio(int freq){
        super(freq,"Cardio", "None", -1);
        System.out.println("Cardio object created");
    }

    public void setTime(int t){time = t;}
    public void setMilestone(int stone){
        super.setMilestone(stone);
        setTime(calcRep(stone));
    }

    public int getTime(){return time;}
}