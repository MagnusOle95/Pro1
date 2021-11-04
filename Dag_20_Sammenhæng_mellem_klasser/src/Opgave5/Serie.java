package Opgave5;

import com.sun.source.doctree.SummaryTree;
import u_group1_0mperson.Person;

import java.util.ArrayList;

public class Serie {

    //Atrtributer
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episoder = new ArrayList<>();

    //constructor
    public Serie(String title, ArrayList<String> cast){
        this.title = title;
        this.cast = cast;
    }


    //Metoder
    public String getTitle(){
        return title;
    }

    public ArrayList<String> getCast(){
        return cast;
    }

    public ArrayList<Episode> getEpisoder(){
        return new ArrayList<>(episoder);
    }

    public Episode creatEpisode(ArrayList<String> guestActors, int lengthMinutes){
        Episode episode = new Episode(guestActors ,lengthMinutes);
        episoder.add(episode);
        return episode;
    }

    /**
     * Return the total length (in minutes) of all the
     * episodes in the series.
     */
    public int totalLength(){
        int sum = 0;
        for (Episode episoder: episoder){
            sum += episoder.getLenght();
        }
        return sum;
    }

    /**
     * Return the total list of all guest actors from all
     * episodes.
     */
    public ArrayList<String> getGuestAllActors(){
        ArrayList<String> allGuestActors = new ArrayList<>();
        for (Episode episoder : episoder){
            for (int i = 0; i < episoder.getGuestActors().size(); i++){
                allGuestActors.add(episoder.getGuestActors().get(i));
            }
        }
        return allGuestActors;
    }



}
