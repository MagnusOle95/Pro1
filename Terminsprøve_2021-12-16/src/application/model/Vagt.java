package application.model;

public class Vagt {

    //attributter
    private int timer;


    //Link attributter
    private Job job;
    private Frivillig frivillig;


    //Contruktor
    Vagt(int timer,Job job,Frivillig frivillig) {
        this.timer = timer;
        this.job = job;
        this.frivillig = frivillig;
        frivillig.addVagt(this);
    }


    //Get og set metoder
    public int getTimer() {
        return timer;
    }

    public Job getJob(){
        return this.job;
    }

    public Frivillig getFrivilig(){
        return this.frivillig;
    }


    //metoder


}
