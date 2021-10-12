package Opgave_1;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Employee {
	/*
	 * Attributter der beskriver den ansattes tilstand
	 */
	private String name;
	private String efterNavn;
	private boolean trainee;
	private int age;

	/*
	 * Constructor, når den ansatte oprettes, skal den have et navn. Ved
	 * oprettelse er den ansatte en trainee
	 */

	public Employee(String inputName,String inputEfterNavn,int inputage){      //Tilføget, int inputage, efter string indputname// //Tilføger efternavn til construktoren//
		name = inputName;
		efterNavn = inputEfterNavn;    //Tilføger efternavn til constructoren//
		trainee = true;
		age = inputage;   //tilføget at age er det samme som indputage//
}


	/*
	 * Den ansattes navn kan ændres ved kald af setName metoden
	 */
	public void setName(String inputName,String inputEfterNavn) {
		name = inputName;
		efterNavn = inputEfterNavn;
	}


	/*
	 * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
	 */
	public String getName() {
		return name;

	}

	public String getEfterNavn() {
		return efterNavn;
	}


	//Ansattes alder sættes//
	public void setAge (int indputage) {
		age = indputage + birthday;

	}


	//ansattes alder kaldes//
	public int getAge() {return age;}

	//Birthday, sættes til 1 så den plusser alderen med 1 år//
	public int birthday = 1;


	/*
	 * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
	 */
	public void setTrainee(boolean isTrainee) {
		trainee = isTrainee;
	}

	/*
	 * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
	 * isTrainee
	 */
	public boolean isTrainee() {
		return trainee;
	}

	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("Navn " + name );
		System.out.println("Efternavn " + efterNavn);
		System.out.println("Trainee " + trainee);
		System.out.println("alder " + age);
	}
}
