package application.model;

import java.time.LocalTime;
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
        this.tutors = new ArrayList<>();
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
            boolean found = false;
            int i = 0;
            int j = 0;

            while (!found && i < tutors.size()) {
                while (!found && j < tutors.get(i).getArrangementer().size()) {

                    LocalTime nåetTilStartTid = tutors.get(i).getArrangementer().get(j).getStartTid();
                    LocalTime nåetTilSlutTid = tutors.get(i).getArrangementer().get(j).getSlutTid();

                    if (arrangement.getDate().equals(tutors.get(i).getArrangementer().get(j).getDate()) &&
                            !arrangement.getSlutTid().isBefore(nåetTilStartTid) && !arrangement.getStartTid().isAfter(nåetTilSlutTid)) {
                        found = true;
                    }
                    j++;
                }
                i++;
            }
            return found;
        }


}
