package modelarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethods {
    public void printArray(int[] tabel) {
        System.out.print("{");
        for (int i = 0; i < tabel.length; i++) {
            if (i == 0) {
                System.out.print(tabel[i]);
            } else {
                System.out.print(", " + tabel[i]);
            }
        }
        System.out.println("}  ");
    }

    /**
     * @return et array med indhold [0,0,0,0,0,0,0,0,0,0]
     */
    public int[] fyldArrayA() {
        int[] result = new int[10];
        return result;
    }

    /**
     * @return et array med indhold [2,44,-23,99,8,-5,7,10,20,30]
     */
    public int[] fyldArrayB() {
        int[] result = new int[]{2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        //TODO
        return result;
    }

    /**
     * @return et array med indhold [0,1,2,3,4,5,6,7,8,9]
     */
    public int[] fyldArrayC() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     * @return et array med indhold [2,4,6,8,10,12,14,16,18,20]
     */
    public int[] fyldArrayD() {
        int[] result = new int[10];
        //TODO
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + 2;
            result[i] = sum;
        }
        return result;
    }

    /**
     * @return et array med indhold [1,4,9,16,25,36,49,64,81,100]
     */
    public int[] fyldArrayE() {
        int[] result = new int[10];
        //TODO
        int tal = 1;
        for (int i = 0; i < result.length; i++, tal++) {
            result[i] = tal * tal;
        }
        return result;
    }

    /**
     * @return et array med indhold [0,1,0,1,0,1,0,1,0,1]
     */
    public int[] fyldArrayF() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 2;
        }
        return result;
    }

    /**
     * @return et array med indhold [0,1,2,3,4,0,1,2,3,4]
     */
    public int[] fyldArrayG() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 5;
        }
        return result;
    }

    public int findMax(int[] tabel) {
        int max = -1;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] > max) {
                max = tabel[i];
            }
        }
        return max;
    }

    //Opgave 2//
    public int sumInt(int[] t) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum = sum + t[i];
        }
        return sum;
    }

    //Opgave 2//
    public double sumDouble(int[] t) {
        double sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum = sum + t[i];
        }
        return sum;
    }

    //Opgave 3//
    public int[] makesum(int[] a, int[] b) {
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }
        return sum;
    }

    //Opgave 6// udregner om arrayet har et uneven tal//
    public boolean hasUneven(int[] t) {
        boolean unEven = false;
        int i = 0;
        while (i < t.length && unEven == false) {
            if (t[i] % 2 == 1) {
                unEven = true;
            }
            i++;
        }
        return unEven;
    }

    //Dag 12 Opgave 4.1 Metode der bytter om på første og sidste element i indput arrayet//
    public int[] exchaceFirstAndLast(int[] t){
        int savePositionOne = t[0]; //Gemmer position 1 så den ikke overskrives//
        t[0] = t[t.length - 1]; //Overskriver position 1 med arrayets slutposition//
        t[t.length - 1] = savePositionOne; //Sætter den gemte position ind på slutposition//
        return t;
    }

    //Dag 12 Opgave 4.2 Metode der rykker alle elemeter i arrayet til højre, og elemetet der er til højre sættes i starten//
    public int[] moveNumbersToRigt(int[] t){
        int saveLastNumber = t[t.length - 1]; //Gemmer det sidste nummer i arrayet//
        for (int i = t.length - 2 ; i >= 0; i--){ //Rykker alle numre til højre//
            t[i+1] = t[i];
        }
        t[0] = saveLastNumber; //Indsatter det gemte nummer på første plads//
        return t;
    }

    //Dag 12 Opgave 4.3 Metode der erstatter alle lige tal i arrayet med 0//
    public int[] qeualNumerToZero(int[] t){
        for (int i = 0; i < t.length; i++){
            if (t[i] % 2 == 0){
                t[i] = 0;
            }
        }
        return t;
    }


}
