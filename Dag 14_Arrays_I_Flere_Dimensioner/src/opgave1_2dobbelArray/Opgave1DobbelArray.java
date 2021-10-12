package opgave1_2dobbelArray;

import com.sun.jdi.Value;

import java.security.PublicKey;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {{0,4,3,9,6}, {1,3,5,2,2}, {3,3,1,0,1}, {0,0,9,7,1}};

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives");
        da.udskrivArray(values);

        //Opgave 1.1//
        System.out.println("\nNummer på række 4, plads 3: " + getValuesAt(values,3 ,2 ) + "\n");

        //Opgave 1.2//
        setValueAt(values,2 ,3 ,22 );
        da.udskrivArray(values); //Kan se at 22 er sat ind på den rigtige plads//

        //Opgave 1.3//
        System.out.println("\nsummere værdien af række 3: " + sumRow(values,2 ));

        //Opgave 1.4//
        System.out.println("\nSummere værdien i kolonne 2: " + sumCol(values, 1));

        //Opgave 1.5//
        System.out.println("\nSummen af hele arrayet: " + sum(values));


        //TODO Tilføj kode der afprøver metoderne du programmerer i klassen DobbelArray til opgave 1
    }

    //Opgave 1.1 Retunere værdi på en bestemt plads i arrayet//
    public static int getValuesAt(int[][] numbers,int row, int col){
        return numbers[row][col];
    }

    //Opgave 1.2 sætter et bestemt tal i arrayet til en ønsket værdi//
    public static void setValueAt(int[][] numbers, int row, int col,int value){
        numbers[row][col] = value;
    }

    //Opgave 1.3 Metode der retunere summen af en række//
    public static int sumRow(int[][] numbers,int row){
        int sum = 0;
        for (int i = 0; i < numbers[row].length; i++){
            sum += numbers[row][i];
        }
        return sum;
    }

    //Opgave 1.4 Metode der summere værdien af en kolonne//
    public static int sumCol(int[][] numbers,int col){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i][col];
        }
        return sum;
    }

    //Opgave 1.5 en metode der retunere summen af alle talende i arrayet//
    public static int sum(int[][] numbers){
        int sum = 0;
        for (int row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length;col++){
                sum += numbers[row][col];
            }
        }
        return sum;
    }










}
