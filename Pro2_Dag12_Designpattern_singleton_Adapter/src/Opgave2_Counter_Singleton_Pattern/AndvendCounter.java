package Opgave2_Counter_Singleton_Pattern;

import java.util.zip.CheckedOutputStream;

public class AndvendCounter {

    public static void main(String[] args) {

        //Opretter objekt af klassen da den ikke findes endnu
        Counter.getInstance();

        //Tester metoden count
        Counter.getInstance().count();
        Counter.getInstance().count();

        //Get values. forventer 2
        System.out.println(Counter.getInstance().getValues());

        //tester metoden gange med 2.
        Counter.getInstance().time2();
        Counter.getInstance().time2();

        //Get values forventer 8
        System.out.println(Counter.getInstance().getValues());

        //Tester zero metoden.
        Counter.getInstance().zero();

        //Get values forventer 0
        System.out.println(Counter.getInstance().getValues());

        //tester om, den opretter en ny eller beholder sig selv.
        Counter.getInstance().count();
        Counter.getInstance().time2();
        Counter.getInstance().count();
        Counter.getInstance().time2();

        System.out.println(Counter.getInstance().getValues());

        Counter.getInstance();

        System.out.println(Counter.getInstance().getValues());





    }


}
