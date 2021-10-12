package Opgave_6_eksempelcar;

public class CarApp {

	public static void main(String[] args) {

		//Folkevogn//
		Car myCar = new Car("VW UP", "White");
		System.out.println(myCar.getBrand());
		myCar.setRegistrationNumber("AB 11 123");
		System.out.println(myCar.getRegistrationNumber());
		System.out.println(myCar.getKm());

		//Mellemrum//
		System.out.println();

		//Seat//
		System.out.println("*******************************");

		Car magnusBil = new Car("Seat Mii","Red");
		System.out.println("Mærke. " + magnusBil.getBrand());
		System.out.println("Farve. " + magnusBil.getColor());

		magnusBil.setRegistrationNumber("(AP 81 327)");
		System.out.println("Registeringsnummer. " + magnusBil.getRegistrationNumber());

		magnusBil.setKm(32000);
		System.out.println("km. " + magnusBil.getKm());

		System.out.println("********************************");







	}

}
