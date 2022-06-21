package Array.array_i_flere_dimentioner.opgave3Teater;

import java.util.Scanner;

public class TheaterFloorApp {


	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		// TODO
		theater.printTheaterFloor();
		Scanner scan = new Scanner(System.in);
		System.out.println("vil du købe en billet til en bestemt PRIS eller en bestemt PLADS");
		String svar = scan.nextLine();

		if (svar.equalsIgnoreCase("PRIS")) {
			System.out.println("Indtast det beløb du vil købe for, min 10 og max 50");
			theater.buyticket(scan.nextInt());

		} else if (svar.equalsIgnoreCase("PLADS")) {
			System.out.println("Hvilken Række vil du side på? 1 til 9");
			int svar2 = scan.nextInt();
			System.out.println("Hvilke sæde vil du side på? 1 til 10");
			theater.buySeat(svar2, scan.nextInt());

		} else {
			System.out.println("Forstår ikke dit svar prøv igen");

		}
	}
}


