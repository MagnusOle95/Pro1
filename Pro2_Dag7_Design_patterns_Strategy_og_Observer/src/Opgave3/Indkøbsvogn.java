package Opgave3;

import java.util.ArrayList;

public class Indkøbsvogn {

    //Link attribut
    ArrayList<Vare> vares;

    public Indkøbsvogn() {
        this.vares = new ArrayList<>();
    }

    public void addVareTilIndkøbsvogn(Vare vare){
        if (!vares.contains(vare)){
            vares.add(vare);
        }
    }

    public void removeVareFraInkøbsvogn(Vare vare){
        if (vares.contains(vare)){
            vares.remove(vare);
        }
    }

    public ArrayList<Vare> getVares(){
        return new ArrayList<>(vares);
    }

    public String beregnSamledePris(){
        double sum = 0;
        System.out.println("Ding-dong-Marked");
        System.out.println("**************************************");
        for (Vare v : getVares()){
            System.out.println(v);
            sum += v.beregnPris();
        }
        System.out.println("----------------------------------------------------------");
        return "Totale pris: " + sum + "Kr";
    }
}
