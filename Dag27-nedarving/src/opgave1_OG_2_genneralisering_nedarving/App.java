package opgave1_OG_2_genneralisering_nedarving;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //Opretter arrayet
        ArrayList<Mekaniker> mekanikere = new ArrayList<>();

        //Opretter og til føjer mekanikere og værkføre til arraylisten;
        Mekaniker m1 = new Mekaniker("Per","Sol vej" ,2019 ,187 );
        Mekaniker m2 = new Mekaniker("Anders","Randers vej" ,1982 ,210 );
        Mekaniker m3 = new Mekaniker("Flmming hansen","Gudøre" ,2004 ,197);
        Værkføre m4 = new Værkføre("John","Gerstrup" ,1978 ,204 ,500 ,2008);
        Synsmand m5 = new Synsmand("Ole","Jystrup" ,187 ,201 ,46 );

        mekanikere.add(m1);
        mekanikere.add(m2);
        mekanikere.add(m3);
        mekanikere.add(m4);
        mekanikere.add(m5);

        System.out.println("Beregner den samlede løn: " + samletLoen(mekanikere));
        m5.setAntalSynPrUge(45);
        System.out.println("Beregner den samlede løn: " + samletLoen(mekanikere));


    }


    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    public static double samletLoen(ArrayList<Mekaniker> list){
        double sum = 0;
        for (Mekaniker m : list){
            sum += m.beregnLoen();
        }
        return sum;
    }

}
