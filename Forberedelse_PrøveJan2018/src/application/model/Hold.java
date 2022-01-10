package application.model;

import java.util.ArrayList;

public class Hold {

    //attributter
    private String betegnelse;
    private String holdLeder;


    //Link attributter
    private Uddannelse uddannelse;
    private ArrayList<Tutor> tutors;

    //Contruktor
    Hold(String betegnelse, String holdLeder,Uddannelse uddannelse){
        this.betegnelse = betegnelse;
        this.holdLeder = holdLeder;
        this.uddannelse = uddannelse;
    }


    //Get og set metoder
    public String getBetegnelse(){
        return this.betegnelse;
    }

    public String getHoldLeder(){
        return this.holdLeder;
    }

    public Uddannelse getUddannelse(){return this.uddannelse;}


    //metoder
    public ArrayList<Tutor> getTutors(){
        return new ArrayList<>(tutors);
    }

    public void addTurtor(Tutor tutor){
        if (!tutors.contains(tutor)){
            tutors.add(tutor);
            tutor.setHold(this);
        }
    }

    public void removeTutor(Tutor tutor){
        if (tutors.contains(tutor)){
            tutors.remove(tutor);
            tutor.setHold(null);
        }
    }

    public double arrangementsPris(){
        double sum = 0;
        for (Tutor t : tutors){
            sum += t.arrangementsPris();
        }
        return sum;
    }

    public boolean harTidsoverlap(Arrangement arrangement){
        boolean overlap = false;
        int i = 0;
        while (!overlap && i < tutors.size()){
            Tutor k = tutors.get(i);

            int j = 0;
            while (!overlap && j < k.getArrangementer().size()){
                if (arrangement.getDate().equals(k.getArrangementer().get(j))){
                    if (arrangement.getStartTid().isBefore(k.getArrangementer().get(j).getSlutTid()) && arrangement.getSlutTid().isAfter(k.getArrangementer().get(j).getStartTid())){
                        overlap = true;
                    }else{
                        j++;
                    }
                }else{
                    j++;
                }
            }
            i++;
        }
        return overlap;
    }



}
