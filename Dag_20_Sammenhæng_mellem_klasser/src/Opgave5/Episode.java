package Opgave5;

import java.util.ArrayList;

public class Episode {
    //Attributer
    private int number;
    private static int nextEpisodeNumber = 1;
    private ArrayList<String> guestActors;
    private int lengthMinutes;

    //Construktor
    Episode(ArrayList<String> guestActors, int lengthMinutes){
        this.number = nextEpisodeNumber;
        this.nextEpisodeNumber++;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;
    }

    //Metoder
    public int getNumber(){
        return number;
    }

    public int getLenght(){
        return lengthMinutes;
    }

    public ArrayList<String> getGuestActors(){
        return guestActors;
    }


}

