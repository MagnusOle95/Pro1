package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tilmelding {

	//attributter
    private String navn;
    private boolean kvinde;
    private LocalDate tilmeldingsDato;
    private int løbeNummer;
    private int løbsTid;


	//Link attributter
    private Løb løb;
    private ArrayList<Note> noter = new ArrayList<>();



	//Contruktor
    Tilmelding(String navn, boolean kvinde, LocalDate tilmeldingsDato, int løbeNummer,Løb løb) {
        this.navn = navn;
        this.kvinde = kvinde;
        this.tilmeldingsDato = tilmeldingsDato;
        this.løbeNummer = løbeNummer;
        this.løbsTid = -1;
        this.løb = løb;
    }


    //Get og set metoder
    public String getNavn() {
        return navn;
    }

    public boolean isKvinde() {
        return kvinde;
    }

    public LocalDate getTilmeldingsDato() {
        return tilmeldingsDato;
    }

    public int getLøbeNummer() {
        return løbeNummer;
    }

    public int getLøbsTid() {
        return løbsTid;
    }

    public Løb getLøb(){
        return løb;
    }

    public ArrayList<Note> getnoter(){
        return new ArrayList<>(noter);
    }


    public void setLøbstid(int løbsTid){
        this.løbsTid = løbsTid;
    }



    //metoder
    public Note createNote(int strafSekunder,Forhindring forhindring){
        Note note = new Note(strafSekunder,forhindring);
        noter.add(note);
        return note;
    }

    public void registrerStrafPåForhindring(String navnForhindring, int strafSekunder){
            boolean fundet = false;
            int i = 0;
            while (fundet == false && i < løb.getForhindringer().size()) {
                String k = løb.getForhindringer().get(i).getNavn();
                if (k.equalsIgnoreCase(navnForhindring)) {
                    createNote(strafSekunder,løb.getForhindringer().get(i));
                    fundet = true;
                } else {
                    i++;
                }
            }
    }

    public int resultatTid(){
        int tid = løbsTid;

        if (tid != -1){
            for (Note n : noter){
                tid += n.getStrafSekunder();
            }
        }
        return tid;
    }

    @Override
    public String toString(){
        return løbeNummer + "      " + navn;
    }







}
