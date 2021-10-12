package Opgave02_Kald_af_instiution;

import javax.xml.transform.Result;
import java.util.Scanner;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public String institution() {
		String result = "";

		if (age < 1){
			result = "Home";
		}else if (age < 3){
			result = ("Nursery");
		}else if (age < 6){
			result = "kindergarden";
		}else if (age < 17){
			result = "School";
		}else if (age >= 17){
			result = "Out of school";
		}
		return result;
	}

	public String gender(){
		String result = "";

		if (boy == true){
			result = "Boy";
		}
		else {
			result = "Girl";
		}
		return result;
	}

	public String gTeam() {
		String result = "";

		if (boy == true) {
			if (age < 8) {
				result = "Young cubs";
			} else {
				result = "cool boys";
			}
		} else {
			if (age < 8) {
				result = "Tubling girls";
			} else {
				result = "springy girls";
			}
		}
		return result;
	}





}




