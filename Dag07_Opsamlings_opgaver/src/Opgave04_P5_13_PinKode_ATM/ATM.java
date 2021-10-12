package Opgave04_P5_13_PinKode_ATM;

import javax.xml.transform.Result;
import java.util.Scanner;

public class ATM {
    private String cardOwnersName;
    private int Password;
    private int indtastedekode;

    public ATM(String kortestEjer, int kodeOrd) {
        this.cardOwnersName = kortestEjer;
        this.Password = kodeOrd;

    }

    public void logIn() {
        System.out.println("Enter password");
        Scanner loginScan = new Scanner(System.in);
        this.indtastedekode = loginScan.nextInt();

        if (this.indtastedekode == this.Password) {
            System.out.println("Your PIN is correct");
        } else {
            System.out.println("Your PIN is incorrect 2 tries left\nEnter password again");
            this.indtastedekode = loginScan.nextInt();

            if (this.indtastedekode == this.Password){
                System.out.println("Your PIN is correct");
            }else{
                System.out.println("Your PIN is incorrect 1 try left\nEnter password again");
                this.indtastedekode = loginScan.nextInt();

                if (this.indtastedekode == this.Password){
                    System.out.println("Your PIN is correct");
                }else{
                    System.out.println("Card is bloced contact your bank");
                }
            }
        }
        loginScan.close();
    }
}




