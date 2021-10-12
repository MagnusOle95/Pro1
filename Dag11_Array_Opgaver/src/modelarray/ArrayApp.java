package modelarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        ArrayMethods metode = new ArrayMethods();

        int[] tabel = metode.fyldArrayA();
        System.out.println("Forventet: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();

        tabel = metode.fyldArrayB();
        System.out.println("Forventet: [2, 44, -23, 99, 8, -5, 7, 10, 20, 30]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();

        tabel = metode.fyldArrayC();
        System.out.println("Forventet: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();

        tabel = metode.fyldArrayD();
        System.out.println("Forventet: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();

        tabel = metode.fyldArrayE();
        System.out.println("Forventet: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();

        tabel = metode.fyldArrayF();
        System.out.println("Forventet: [0, 1, 0, 1, 0, 1, 0, 1, 0, 1]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();

        tabel = metode.fyldArrayG();
        System.out.println("Forventet: [0, 1, 2, 3, 4, 0, 1, 2, 3, 4]");
        System.out.println("Aktuelt  : " + Arrays.toString(tabel));
        System.out.println();


        int[] tabel2 = { 78, 23, 1, 4, 65, 3, 87, 5, 12 };
        metode.printArray(tabel2);
        System.out.println(metode.findMax(tabel2));

        //Opgave 2//
        System.out.println(metode.sumInt(tabel));
        System.out.println(metode.sumDouble(tabel));
        System.out.println(metode.sumInt(tabel2));
        System.out.println(metode.sumDouble(tabel2));

        //Opgave 3//
        int[] tabelA = {4,6,8,12,26,96,24,56,46,36};
        int[] tabelB = {5,4,3,2,1,7,9,98,67,456};
        System.out.println(Arrays.toString(metode.makesum(tabelA, tabelB)));

        // Opgave 7 //
        System.out.println("\nTalbelA er uneven: " + metode.hasUneven(tabelA));
        System.out.println("TabelB er uneven: " +metode.hasUneven(tabelB));

        //dag 12 Opgave 4.1//
        System.out.println(Arrays.toString(metode.exchaceFirstAndLast(tabelA)));

        //Dag 12 Opgave 4.2//
        System.out.println("Rykker alle tal til højre i tabelA: " + Arrays.toString(metode.moveNumbersToRigt(tabelA)));
        System.out.println("Rykker alle tal til højre i tabelB: " + Arrays.toString(metode.moveNumbersToRigt(tabelB)));

        //Dag 12 Opgave 4.3//
        System.out.println("Udskifter alle lige tal med 0 i tabelA: " + Arrays.toString(metode.qeualNumerToZero(tabelA)));
        System.out.println("Udskifter alle lige tal med 0 i tabelB: " + Arrays.toString(metode.qeualNumerToZero(tabelB)));






    }

}
