package Opgave5;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerieEpisodeApp {

    public static void main(String[] args) {
        //Opretter serie med cast//
        ArrayList<String> castSerie1 = new ArrayList<>();
        castSerie1.add("Lars Jensen");
        castSerie1.add("Per Andersen");
        castSerie1.add("Frida Carlsen");
        castSerie1.add("Jens Jennerboooiiii");
        Serie serie1 = new Serie("Den Flyvende måtte",castSerie1);

        ArrayList<String> GuestCastEpisode1 = new ArrayList<>();
        GuestCastEpisode1.add("Benny Jamz");
        GuestCastEpisode1.add("Kanye East");
        GuestCastEpisode1.add("Frankie Jensen");
        Episode e1 = serie1.creatEpisode(GuestCastEpisode1,30);

        ArrayList<String> GuestCastEpisode2 = new ArrayList<>();
        GuestCastEpisode2.add("Henning H");
        GuestCastEpisode2.add("Flemming jørgensen");
        GuestCastEpisode2.add("Tramper Ole");
        Episode e2 = serie1.creatEpisode(GuestCastEpisode2,27);

        System.out.println();

        System.out.println("Seriens's navn: " + serie1.getTitle());
        System.out.println("Serien's cast: " + serie1.getCast());

        System.out.println();

        for (int i = 0; i < serie1.getEpisoder().size(); i++){
            System.out.println("Episode: " + serie1.getEpisoder().get(i).getNumber());
            System.out.println("Længden af episoden: " + serie1.getEpisoder().get(i).getLenght() + " Min");
            System.out.println("Gæsteskuespillerne: " + serie1.getEpisoder().get(i).getGuestActors());
            System.out.println();
        }

        System.out.println("Total længde af alle episoder i serien: " + serie1.totalLength() + " Min\n");

        System.out.println("Alle gæste skuespillerne for alle episoder, i serien:\n" + serie1.getGuestAllActors());




    }
}
