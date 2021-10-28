package Opgave1;

/**
 * klassen opretter en bankkonto
 */
public class BankAccount {

    private double balance;
    private int accountNumber;
    private static int nextAssignedNumber = 5030;

    /**
     * Opretter bankkonto med et beloeb, og giver bankontoen et ID nummer
     * @param initialbalance
     */
    public BankAccount(double initialbalance){
        balance = initialbalance;
        accountNumber = BankAccount.nextAssignedNumber;
        BankAccount.nextAssignedNumber++;
    }

    /**
     * Insaette beløb på konto
     * @param amount
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * Haeve beloeb på konto
     * @param amount
     */
    public void withdraw(double amount){
        balance -= amount;
    }

    /**
     * Retunere beloeb på konto
     * @return
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Retunere bankkontoens ID nummer
     * @return
     */
    public int getID(){
        return accountNumber;
    }

    /**
     * retunere det sidste assigned nummer
     * @return
     */
    public static int getNextAssignedNumber(){
        return nextAssignedNumber;
    }
}
