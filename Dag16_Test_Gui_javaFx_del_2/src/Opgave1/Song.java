package Opgave1;

public class Song {

    //attributer//
    private String title;
    private String artist;
    private int bpm;

    //Construktor//
    public Song(String title, String artist,int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    //Get metode til title//
    public String getTitle(){
        return title;
    }

    //Get metode til artist//
    public String getArtist(){
        return artist;
    }

    //Get metode til bpm//
    public int getBpm(){
        return bpm;
    }

    //printSong metode//
    public void printSong(){
        System.out.println("****************************************");
        System.out.println("Titel     : " + title);
        System.out.println("kunstner  : " + artist);
        System.out.println("Hastighed : " + bpm + " (Bpm)");
        System.out.println("****************************************");
    }

}
