package Opgave1_Primtal_1_til_10;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave1_App {

        public static void main(String[] args) {
            int[] prim = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Hvilket nr. primtal skal vises?: ");
                int n = scan.nextInt();
                System.out.println("Primtal nr. " + n + " er "
                        + prim[n - 1] + "\n");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Tallet skal være fra 1 til og med 10");
            }
            catch (InputMismatchException e){
                System.out.println("Du kan kun bruge tal, ikke bogstaver og andre symboler");
            }
        }
    }




