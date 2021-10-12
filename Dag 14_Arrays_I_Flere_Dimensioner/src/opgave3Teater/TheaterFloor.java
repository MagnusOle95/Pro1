package opgave3Teater;

import java.awt.*;
import java.util.Arrays;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {
		// TODO

		return -1;
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */
	public void buyticket(int price) {
		// TODO
		boolean tjekForPlads = true;
		for (int row = 0; row < seats.length && tjekForPlads == true ; row++) {
			for (int col = 0; col < seats[row].length && tjekForPlads == true; col++) {
				if (seats[row][col] == price) {
					seats[row][col] = 0;
					tjekForPlads = false;

				}
			}
		}
	}


	public void printTheaterFloor() {
		// TODO
		//Printer rækken med sæde//
		System.out.print("  Sæde :");
		for (int i = 1; i <= 10; i++){
			System.out.print(" " + i + "  ");
		}

		System.out.println(); // Mellemrum//

		//Printer ------ mellem sæde og rækker//
		for (int i = 0; i <= 46; i++){
			System.out.print("-");
		}

		System.out.println(); //Mellemrum//

		//printer alle sædder og rækkerne//
		for (int row = 0; row < seats.length; row++){
			System.out.print("Række " + (row + 1) + ": ");
			for (int col = 0; col < seats[row].length; col++){
				System.out.print(seats[row][col] + ", ");
			}
			System.out.println();
		}
	}
}
