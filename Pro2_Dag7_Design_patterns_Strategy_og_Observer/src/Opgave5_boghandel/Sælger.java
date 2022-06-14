package Opgave5_boghandel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sælger implements Observer {

    private String navn;

    public Sælger(Subject o, String navn){
        this.navn = navn;
        o.registerObserver(this);

    }

    public void update(Subject o) {
        ArrayList<Kunde> kunder = ((BogTitle) o).getKunder();
        Set<BogTitle> bøger = new HashSet();
        for (Kunde k : kunder){
            for (BogTitle b : k.getbøger()){
                bøger.add(b);
            }
        }
        System.out.println("Andre kunder har også købt disse bøger: " + bøger);
    }
}
