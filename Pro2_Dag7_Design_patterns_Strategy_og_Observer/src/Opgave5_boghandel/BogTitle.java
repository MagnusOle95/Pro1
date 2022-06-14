package Opgave5_boghandel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BogTitle implements Subject {

    private Set<Observer> observers;
    private ArrayList<Kunde> kunder;

    private String title;
    private int antal;

    public BogTitle(String title, int antal){
        this.title = title;
        this.antal = antal;
        observers = new HashSet<Observer>();
        kunder = new ArrayList<Kunde>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public ArrayList<Kunde> getKunder(){
        return new ArrayList<>(kunder);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public String getTitle(){
        return title;
    }

    public int getAntal(){
        return antal;
    }

    public void indkøbTilLager(int antal){
        this.antal += antal;
    }

    public void etKøb(Kunde k){
     antal--;
     kundekøb(k);
     notifyObserver();

    }

    public void notifyObserver(){
        Iterator<Observer> itr = observers.iterator();
        while (itr.hasNext()){
            Observer o = itr.next();
            o.update(this);
        }
    }

    public void kundekøb(Kunde kunde) {
        if (kunder.contains(kunde)){
            kunde.addBogTile(this);
        }else{
            kunder.add(kunde);
            kunde.addBogTile(this);
        }
    }

    public String toString(){
        return title;
    }



}
