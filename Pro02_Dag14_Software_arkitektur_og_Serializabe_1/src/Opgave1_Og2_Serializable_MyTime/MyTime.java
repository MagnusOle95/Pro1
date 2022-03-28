package Opgave1_Og2_Serializable_MyTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {

    private int time;
    private List<String> times;

    public MyTime() {
        this.time = 0;
        times = new ArrayList<>();
    }

    //Metoder
    public void increase(){
        time++;
    }

    public void reset(){
        this.time = 0;
    }

    public int getTime(){
        return this.time;
    }

    public void saveTime(){
        times.add(time+ "");
    }

    @Override
    public String toString(){
        return time + "";
    }



}
