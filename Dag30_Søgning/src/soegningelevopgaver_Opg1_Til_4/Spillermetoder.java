package soegningelevopgaver_Opg1_Til_4;

import java.util.ArrayList;

public class Spillermetoder {
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        // TODO Opgave 4.1
        Spiller spiller = null;
        int i = 0;
        while (spiller == null && i < spillere.size()){
            Spiller s = spillere.get(i);
            if (s.getMaal() == score){
                spiller = s;
            }else{
                i++;
            }
        }
        return spiller;
    }


    //Opgave 4.2
    public Spiller findScoreBinær (ArrayList<Spiller> spillere,int score){
        Spiller spiller = null;
        int left = 0;
        int right = spillere.size() - 1;
        int middle = -1;

        while (spiller == null && left <= right){
            middle = (left + right) /2;
            Spiller k = spillere.get(middle);
            int comp = k.getMaal() - score;

            if (comp == 0){
                spiller = k;
            }else if (comp < 0){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return spiller;
    }


    //Opgave 4.3
    public String godSpiller (ArrayList<Spiller> spillere){
        String navn = "";
        int i = 0;
        while (navn.equals("") && i < spillere.size()){
            Spiller k = spillere.get(i);
            if (k.getHoejde() < 170 && k.getMaal() > 50){
                navn = k.getNavn();
            }else{
                i++;
            }
        }
        return navn;
    }



    // Her tilføjes metoder der løser opgve 4.2 og 4.3

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1

        System.out.println("Ophgave 4,1");
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 203, 89, 60));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));

        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinear(spillerListe, 30));

        // Tilføj kode der afprøver opgaver 4.2 og 4.3

        //Opgave 4.2
        System.out.println("\nOpgave 4,2");
        ArrayList<Spiller> spillerListe2 = new ArrayList<>();
        spillerListe2.add(new Spiller("Bo", 203, 89, 60));
        spillerListe2.add(new Spiller("Hans", 196, 99, 45));
        spillerListe2.add(new Spiller("Mads", 200, 103, 37));
        spillerListe2.add(new Spiller("Lars", 192, 86, 35));
        spillerListe2.add(new Spiller("Jens", 188, 109, 32));
        spillerListe2.add(new Spiller("Finn", 194, 102, 12));

        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreBinær(spillerListe2, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreBinær(spillerListe2, 30));

        //Opgave 4.3

        System.out.println("\nOpgave 4,3");
        ArrayList<Spiller> spillerListe3 = new ArrayList<>();
        spillerListe3.add(new Spiller("Hans", 196, 99, 45));
        spillerListe3.add(new Spiller("Bo", 203, 89, 60));
        spillerListe3.add(new Spiller("Jens", 188, 109, 32));
        spillerListe3.add(new Spiller("Finn", 194, 102, 12));
        spillerListe3.add(new Spiller("Lars", 192, 86, 35));
        spillerListe3.add(new Spiller("Mads", 200, 103, 37));
        spillerListe3.add(new Spiller("Frank",160,60,52));

        System.out.println("spiller under 170cm med mere end score med 50 mål: " + metoder.godSpiller(spillerListe3));






    }

}
