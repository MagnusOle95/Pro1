package Klassehierarkier_AkstraktKlasse.AbstraktKlasse_Mekaniker;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //Opretter arrayet
        ArrayList<Ansat> ansatte = new ArrayList<>();

        //Opretter og til føjer mekanikere og værkføre til arraylisten;
        Mekaniker m1 = new Mekaniker("Per","Sol vej" ,2019 ,187 );
        Mekaniker m2 = new Mekaniker("Anders","Randers vej" ,1982 ,210 );
        Mekaniker m3 = new Mekaniker("Flmming hansen","Gudøre" ,2004 ,197);
        Værkføre m4 = new Værkføre("Jhonny","Sving vej" ,200.0,300 ,1984);
        Synsmand m5 = new Synsmand("Ole","Jystrup" ,187 ,201 ,46 );
        ArbejdsDreng m6 = new ArbejdsDreng("Egon","Valby" ,50.0);

        ansatte.add(m1);
        ansatte.add(m2);
        ansatte.add(m3);
        ansatte.add(m4);
        ansatte.add(m5);
        ansatte.add(m6);

        System.out.println("Beregner den samlede løn: " + samletLoen(ansatte));
        m5.setAntalSynPrUge(45);
        System.out.println("Beregner den samlede løn: " + samletLoen(ansatte));


    }


    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    public static double samletLoen(ArrayList<Ansat> list){
        double sum = 0;
        for (Ansat m : list){
            sum += m.beregnLoen();
        }
        return sum;
    }

}
