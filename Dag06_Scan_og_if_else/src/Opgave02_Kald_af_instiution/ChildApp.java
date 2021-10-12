package Opgave02_Kald_af_instiution;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(4, true);// boy 4 years old
		Child c2 = new Child(6, false);// girl 2 years old
		Child c3 = new Child(10, true);
		Child c4 = new Child(17, false);


		System.out.print("\nBarnets køn; " + c1.gender() +
				"\nAlder " + c1.getAge() +
				"\nskal i " + c1.institution()+
				"\nGymnastikhold: " + c1.gTeam() +
				"\n");

		System.out.print("\nBarnets køn; " + c2.gender() +
				"\nAlder " + c2.getAge() +
				"\nskal i " + c2.institution()+
				"\nGymnastikhold: " + c2.gTeam() +
				"\n");

		System.out.print("\nBarnets køn; " + c3.gender() +
				"\nAlder " + c3.getAge() +
				"\nskal i " + c3.institution()+
				"\nGymnastikhold: " + c3.gTeam() +
				"\n");

		System.out.print("\nBarnets køn; " + c4.gender() +
				"\nAlder " + c4.getAge() +
				"\nskal i " + c4.institution()+
				"\nGymnastikhold: " + c4.gTeam() +
				"\n");




	}

}
