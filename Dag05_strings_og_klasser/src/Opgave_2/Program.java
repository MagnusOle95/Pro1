package Opgave_2;

public class Program {
    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        //Udskriver ord 1 og 2 med store bogstaver// (Opgave a og b)
        String ord1Up = ord1.toUpperCase();
        System.out.println("\n" + ord1Up);

        String ord2low = ord2.toLowerCase();
        System.out.println(ord2low + "\n");
        ////////////////////////////////////////////////////////////////////

        //Sammensætter ord 1 og 2 og printer det ud// (Opgave c)
        System.out.println(ord1 + " " + ord2);
        System.out.println(ord1Up + " " + ord2low + "\n");
        ////////////////////////////////////////////////////////////////////

        //Sammensætter ord 1 og ord 2 til ord 3, og ord 2 er med små bogstaver// (Opgave d)
        String ord3 = ord1 + ord2low;
        System.out.println(ord3 + "\n");
        ///////////////////////////////////////////////////////////////////////

        //Udskriver længden af stregnen fra opgave d// (Opgave e)
        int ord3Len = ord3.length();
        System.out.println(ord3Len + "\n");
        ////////////////////////////////////////////////////////////////////////

        //Udskriver de første 7 bogstaver fra ord 1// (Opgave f)
        String ord1_førsteSyvBogstaver = ord1.substring(0,7);
        System.out.println(ord1_førsteSyvBogstaver + "\n");
        ////////////////////////////////////////////////////////////////////////

        //udskriver bogstav 3 til 7 fra ord 2// (Opgave g)
        String ord2_bogstav3Til7 = ord2.substring(2,7);
        System.out.println(ord2_bogstav3Til7 + "\n");
        ////////////////////////////////////////////////////////////////////////

        //Udskriver den sidste halvdel af ord 3 fra Opgave d//
        int halvDel_Ord3 = ord3Len / 2;
        String ord3SidsteHalvdel = ord3.substring(halvDel_Ord3);
        System.out.println(ord3SidsteHalvdel);



    }



}
