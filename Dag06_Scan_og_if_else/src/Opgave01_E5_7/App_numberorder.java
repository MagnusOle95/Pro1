package Opgave01_E5_7;

import java.util.Scanner;

public class App_numberorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast de 3 tal, med mellemrum hvert tal");
        int tal1  = scan.nextInt();
        int tal2 = scan.nextInt();
        int tal3 = scan.nextInt();

        if (tal1 < tal2 && tal2 < tal3){
            System.out.println("Increasing");
        } else if (tal1 > tal2 && tal2 > tal3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("neither");
        }
    }
}
