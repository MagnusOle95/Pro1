import array.Array;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Opgave2 {

	public static int højesteAntalBenbrud(int[][] values) {
		// TODO
		int hoejsteAntalBenbrud = 0;
		for (int row = 0; row < values.length; row++){
			for (int col = 0; col < values[row].length; col++){
				if (hoejsteAntalBenbrud < values[row][col]){
					hoejsteAntalBenbrud = values[row][col];
				}
			}
		}
		return hoejsteAntalBenbrud;
	}

	public static int[] samledeAntalBenbrudPrÅr(int[][] values) {
		// TODO
		int[] årsBasis = new int[values.length];
		int sum = 0;
		for (int row = 0; row < values.length; row++){
			for (int col = 0; col < values[row].length; col++){
				sum += values[row][col];
			}
			årsBasis[row] = sum;
			sum = 0;
		}
		return årsBasis;
	}

	public static int[] samledeAntalBenbrudPrMåned(int[][] values) {
		// TODO
		int[] månedbasis = new int[values[0].length];
		int sum = 0;
		int row = 0;
		for (int col = 0; col < values[row].length; col++){
			for (row = 0; row < values.length - 1; row++){
				sum += values[row][col];
			}
			månedbasis[col] = sum;
			sum = 0;
		}
		return månedbasis;
	}

	public static int månedMedHøjstAntalBenbrud(int[][] values) {
		// TODO
		int stoesteantalBenBrud = 0;
		int måned = 0;
		int[] månedbasis = samledeAntalBenbrudPrMåned(values);

		for (int månedCalc = 0; månedCalc < månedbasis.length; månedCalc++){
			if (stoesteantalBenBrud <= månedbasis[månedCalc]){
				stoesteantalBenBrud = månedbasis[månedCalc];
				måned = månedCalc;
			}
		}
		return måned;
	}

	public static void udskrivArray(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print("År " + (2015 + i) + ": ");
			for (int j = 0; j < values[i].length; j++) {
				System.out.printf("%5d", values[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] benbrud = {
				{ 98, 117, 120, 80, 98, 56, 66, 45, 78, 86, 89, 99 },
				{ 101, 99, 75, 67, 79, 56, 50, 57, 88, 77, 75, 96 },
				{ 112, 95, 110, 97, 89, 65, 44, 56, 88, 67, 45, 80 },
				{ 89, 92, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89 }
		};
		udskrivArray(benbrud);
		System.out.println();

		System.out.print("Max antal benbrud i en måned: " );
		System.out.println(højesteAntalBenbrud(benbrud));

		System.out.print("Samlede antal benbrud pr. år: " );
		System.out.println(Arrays.toString(samledeAntalBenbrudPrÅr(benbrud)));

		System.out.print("Samlede antal benbrud pr. måned: " );
		System.out.println(Arrays.toString(samledeAntalBenbrudPrMåned(benbrud)));

		System.out.print("Indeks for måneden med max antal benbrud pr. måned: " );
		System.out.println(månedMedHøjstAntalBenbrud(benbrud));
	}
}
