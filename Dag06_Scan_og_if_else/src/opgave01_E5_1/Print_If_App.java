package opgave01_E5_1;


import eksempel_if_scanner.EksempelIf;

import java.util.Scanner;

public class Print_If_App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("indtast værdi");

        int svar = scan.nextInt();

        if (svar < 0){
            System.out.println("tallet er negativt");
        }else if (svar == 0){
            System.out.println("Tallet er null");
        } else if (svar > 0){
            System.out.println("Tallet er positivt");
        }
        scan.close();


    }
}
