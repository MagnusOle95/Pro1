package afleveringfravær;

import java.text.DecimalFormat;

public class FravaersSystem {
	/**
	 * Fraværstallene udskrives på skærmen
	 *
	 * @param fravaer
	 */
	public void udskrivFravaer(int[][] fravaer) {
		// TODO opgave 1
		//Print texst Elev/måned and month number//
		System.out.print("Elev/Måned\t");
		for (int i = 1; i <= 12;i++){
			System.out.print(i + ":\t\t");
		}
		//Make a new line//
		System.out.println();

		//Prints the array and student number//
		for (int row = 0; row < fravaer.length; row++){
			System.out.print(row + 1 + ":\t\t\t");
			for (int col = 0; col < fravaer[row].length;col++){
				System.out.print(fravaer[row][col] + "\t\t");
			}
			//Make a new line in the array print//
			System.out.println();
		}
	}

	/**
	 * Returnerer det samlede antal fravaerdage over 12 måneder for eleven med
	 * elevnr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public int samletFravaer(int[][] fravaer, int elevNr) {
		// TODO opgave 2
		//Sum a specefic students absence for 12 month//
		int sum = 0;
		for (int col = 0; col < fravaer[elevNr - 1].length; col++){
			sum += fravaer[elevNr - 1][col];
		}
		return sum;
	}

	/**
	 * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
	 * elevNr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public double gennemsnit(int[][] fravaer, int elevNr) {
		// TODO opgave 3
		//Using the sum from method samletfravaer and dividing it with 12//
		return this.samletFravaer(fravaer,elevNr)/12.0;
	}

	/**
	 * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
	 *
	 * @param fravaer
	 * @return
	 */
	public int antalUdenFravaer(int[][] fravaer) {
		// TODO opgave 4
		//Using the sum from method samletfravaerd and count alle the students with no absence//
		int studentswithOutAbsence = 0;
		for (int i = 1; i < fravaer.length + 1; i++){
			if (this.samletFravaer(fravaer,i ) == 0){
				studentswithOutAbsence++;
			}
		}
		return studentswithOutAbsence;
	}

	/**
	 * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
	 * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer
	 * for en af disse.
	 *
	 * @param fravaer
	 * @return
	 */
	public int mestFravaer(int[][] fravaer) {
		// TODO opgave 5
		return -1;

	}

	/**
	 * Registrerer at elenven med elevNr ikke har haft fravær i nogen af de 12
	 * måneder.
	 *
	 * @param fravaer
	 * @param elevNr
	 */
	public void nulstil(int[][] fravaer, int elevNr) {
		// TODO opgave 6
	}
}
