import java.util.ArrayList;

public class HundeApp {
    public static void main(String[] args) {

        //Opretter hunde//
        ArrayList<Hund> hunde = new ArrayList<>();

        Hund h1 = new Hund("Egon",true ,4200 ,Race.TERRIER);
        Hund h2 = new Hund("Basse",false ,2500 ,Race.BOKSER);
        Hund h3 = new Hund("Puff",true,32000,Race.PUDDEL);
        Hund h4 = new Hund("Jørgen",false ,1200 ,Race.BOKSER);
        Hund h5 = new Hund("Bibbo",false ,6700 ,Race.TERRIER);

        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);
        hunde.add(h4);
        hunde.add(h5);

        System.out.println(samletPris(hunde,Race.TERRIER));

    }


    public static int samletPris(ArrayList<Hund> listeAfHunde,Race race){
        int sum = 0;
        for (Hund hund : listeAfHunde){
            if (hund.getRace().equals(race)){
                sum += hund.getPris();
            }
        }
        return sum;
    }
}
