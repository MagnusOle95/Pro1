package Opgave5_boghandel;

import java.util.ArrayList;

public class Kunde {

    ArrayList<BogTitle> bøger;

    private String navn;

    public Kunde(String navn){
        this.navn = navn;
        bøger = new ArrayList<BogTitle>();
    }

    public void addBogTile(BogTitle bogTitle) {
        bøger.add(bogTitle);
    }

    public ArrayList<BogTitle> getbøger(){
        return new ArrayList<>(bøger);
    }

}


