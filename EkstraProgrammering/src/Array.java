import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		int[] tabel = new int[10];
		tabel[0] = 45;
		tabel[1] = 27;
		tabel[2] = -12;
		tabel[3] = 15;
		tabel[4] = -8;
		tabel[5] = -4;

		// Alternativ intialisering og oprettelse:
		// int[] tabel = {45, 27, -12, 15, -8, -4, 0, 0, 0, 0};
		
		System.out.println(Arrays.toString(tabel));

		System.out.println("Sætter plads 3 til 20");
		tabel[3] = 20;
		System.out.println(Arrays.toString(tabel));

		//Indsætter 17 mellem 17 og 27, og rykker arrayet til højre//
		System.out.println("indsætter 17 mellem 27 0g minus 12");
		for (int i = tabel.length - 1; i > 2;i--){
			tabel[i] = tabel[i - 1];
		}
		tabel[2] = 17;
		System.out.println(Arrays.toString(tabel));

		//Sletter tallet på indeks 1 of flytter arrayet, til vestre//
		System.out.println("Slette tallet på indeksplads 1");
		for (int i = 1; i < tabel.length - 1; i++){
			tabel[i] = tabel[i + 1];
		}
		System.out.println(Arrays.toString(tabel));

		//Indsætter 34 forrest i arrayet og rykker alt til højre//
		System.out.println("Indsætter 34 forrest i arratet og rykker alt til højre");
		for (int i = tabel.length - 1; i > 0; i--){
			tabel[i] = tabel[i - 1];
		}
		tabel[0] = 34;
		System.out.println(Arrays.toString(tabel));

		//Indsætter 29 på første ledige plads//
		System.out.println("Indsætter 29 på første ledige plads - i enden af arrayet");
		int count = 0;
		while (tabel[count] != 0){
			count++;
		}
		tabel[count] = 29;
		System.out.println(Arrays.toString(tabel));

	}

	/**
	* Return the sum of all numbers in the list.
	* Return 0 if the list is empty.
	*/
	public static int sum(int[] liste) {
		return -1;
	}
	/**
	* Return the minimum of all numbers in the list.
	* Pre: The list is not empty.
	*/
	public static int minimum(int[] liste){
		return -1;
	}
	/**
	* Return the maximum of all numbers in the list.
	* Pre: The list is not empty.
	*/
	public static int maximum(int[] liste){
		return -1;
	}
	
	/** Return the number of negative numbers in the list. */
	public static int negative(int[] liste){
		return -1;
	}
	/** Return a new array containing the positive numbers in the list. */
	public static int[] positive(int[] liste){
		return null;
	}
}
