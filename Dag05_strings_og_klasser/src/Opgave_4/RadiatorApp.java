package Opgave_4;

public class RadiatorApp {
    public static void main(String[] args) {

        //Opretter raditator//
        Radiator radiator1 = new Radiator(22);
        System.out.println("*********************");
        System.out.println("radiator 1");
        System.out.println("temperatur " + radiator1.getRadiatorTemp() + "\n");

        //Radiator 2//
        Radiator radiator2 = new Radiator();
        System.out.println("*********************");
        System.out.println("radiator 2");
        System.out.println("temperatur " + radiator2.getRadiatorTemp() + "\n");


        //Skru ned for radiator 1//
        radiator1.skruNed(12);
        System.out.println("*********************");
        System.out.println("radiator 1 skruget ned");
        System.out.println("temperatur " + radiator1.getRadiatorTemp() + "\n");

        //Skrug op for radiator 2//
        radiator2.skruOp(8);
        System.out.println("*********************");
        System.out.println("radiator 2 skruget op");
        System.out.println("temperatur " + radiator2.getRadiatorTemp() + "\n");
    }
}
