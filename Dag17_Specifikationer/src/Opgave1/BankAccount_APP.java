package Opgave1;

import java.sql.SQLOutput;

public class BankAccount_APP {
    public static void main(String[] args) {
        //Opretter bankkontoer//
        BankAccount bc1 = new BankAccount(5000);
        BankAccount bc2 = new BankAccount(3000);
        BankAccount bc3 = new BankAccount(2500);

        //Indsætter beloeb på konto//
        bc1.deposit(500);

        //Hæver beloeb på konto//
        bc1.withdraw(1000);

        //forespørger hvad balancen er på kontoen//
        System.out.println("Bankonto 1's Balance: " + bc1.getBalance());

        //Forespørger hvad id nummeret er på kontoen//
        System.out.println("Bankonto 1's IDnummer: " + bc1.getID());

        //Forespoer om id og balance for bc2 og 3//
        System.out.println("Bankonto 2 balance: " + bc2.getBalance() + " Bankonto's Idnummer: " + bc2.getID());
        System.out.println("Bankonto 3 balance: " + bc3.getBalance() + " Bankonto's Idnummer: " + bc3.getID());

        //Forespørger klassen, for de sidste assigned number//
        System.out.println("Næste bankonto vil have nummeret: " + BankAccount.getNextAssignedNumber());
    }
}
