package Opgave4;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
	private char level;
	private int weeklyWaterHours;
	private int weeklyStrengthHours;
	private ArrayList<Swimmer> svømmere = new ArrayList<>();


	public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
		this.level = level;
		this.weeklyWaterHours = weeklyWaterHours;
		this.weeklyStrengthHours = weeklyStrengthHours;
	}

	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char niveau) {
		this.level = niveau;
	}
	
	public int getWeeklyStrengthHours() {
		return weeklyStrengthHours;
	}
	
	public void setWeeklyStrengthHours(int weeklyStrengthHours) {
		this.weeklyStrengthHours = weeklyStrengthHours;
	}
	
	public int getWeeklyWaterHours() {
		return weeklyWaterHours;
	}
	
	public void setWeeklyWaterHours(int weeklyWaterHours) {
		this.weeklyWaterHours = weeklyWaterHours;
	}

	public ArrayList<Swimmer> getswimmers(){
		return new ArrayList<>(svømmere);
	}

	public Swimmer createSwimmer(String name, int yearGroup, ArrayList<Double> laptime, String club){
		Swimmer swm = new Swimmer(name,yearGroup ,laptime ,club);
		svømmere.add(swm);
		return swm;
		}


	public void removeSwimmer(Swimmer svømmer){
		if (!svømmere.contains(svømmer)){
			svømmere.remove(svømmer);
		}
	}
	
}
