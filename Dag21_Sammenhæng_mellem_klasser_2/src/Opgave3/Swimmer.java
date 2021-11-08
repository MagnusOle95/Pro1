package Opgave3;

import java.util.ArrayList;

/**
 * Modeling a Swimmer
 */
public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private ArrayList<Double> lapTimes;
    private TrainingPlan træningsplan;
    
    /**
     * Initialize a new swimmer with name, club, yearGroup, and lap times.
     */ 

   public Swimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club) {
       this.name = name;
       this.yearGroup = yearGroup;
       this.lapTimes = lapTimes;
       this.club = club;
   }
    /**
     * Return the name of the swimmer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the yearGroup of the swimmer
     */
    public int getYearGroup() {
        return this.yearGroup;
    }

    /**
     * Return the club of the swimmer
     */
    public String getClub() {
        return this.club;
    }

    /**
     * Register the club of the swimmer
     * @param club
     */
    public void setClub(String club) {
        this.club = club;
    }
    
    /**
     * Return the fastest lap time
     */
    public double bestLapTime() {
        double best = Double.MAX_VALUE;
        for (double time: lapTimes) {
        	if(best > time) {
        		best = time;
        	}
        }
        return best;
    }

    public TrainingPlan getTræningsplan (){
        return træningsplan;
    }

    public void setTræningsplan(TrainingPlan tp){

        if (this.træningsplan != tp){

            // Fjern mig (svømmeren) fra min gamle plan
            if (this.træningsplan != null){
                this.træningsplan.removeSwimmer(this);
            }

            // Sæt min (svømmerens) træningsplan til den nye
            this.træningsplan = tp;

            // Hvis den nye træningsplan ikke er null, så tilføj mig (svømmeren)
            if (this.træningsplan != null){
                this.træningsplan.AddPerson(this);
            }
        }
    }

    public void removetrainingplan(){
        if (this.træningsplan != null){
            this.træningsplan.removeSwimmer(this);
        }
        this.træningsplan = null;

    }

    /**
     * Return how many training hours the swimmer has each week.
     */
    public int allTrainingHour(){
        return træningsplan.getWeeklyStrengthHours() + træningsplan.getWeeklyWaterHours();
    }

    @Override
    public String toString(){
        return name;
    }





}
