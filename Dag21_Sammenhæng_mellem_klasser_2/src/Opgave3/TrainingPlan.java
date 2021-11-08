package Opgave3;

import Opgave2.Person;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
	private char level;
	private int weeklyWaterHours;
	private int weeklyStrengthHours;
	private ArrayList<Swimmer> swimmers;
	
	public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
		this.level = level;
		this.weeklyWaterHours = weeklyWaterHours;
		this.weeklyStrengthHours = weeklyStrengthHours;
		this.swimmers = new ArrayList<Swimmer>();
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

	public void AddPerson(Swimmer swimmer){
		if (!swimmers.contains(swimmer)){
			swimmers.add(swimmer);
			swimmer.setTræningsplan(this);
		}
	}

	public void removeSwimmer(Swimmer swimmer) {
		if (swimmers.contains(swimmer)) {
			swimmers.remove(swimmer);
			swimmer.removetrainingplan();
		}
	}

	@Override
	public String toString(){
		return "Level: " + level + "\nNavne: " + swimmers;
	}
	
}
