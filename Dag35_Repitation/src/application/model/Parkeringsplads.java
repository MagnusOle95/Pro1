package application.model;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Parkeringsplads {

    //Attributer
    private int nummer;
    private LocalTime ankomst;

    //Link attributer
    private Bil bil;
    private Parkeringshus parkeringshus;

    //Construktor
    Parkeringsplads(int nummer, Parkeringshus parkeringshus) {
        this.nummer = nummer;
        this.ankomst = null;
        this.parkeringshus = parkeringshus;
        this.bil = null;
    }

    //Sammenhængende til Bil klassen
    public Bil getBil(){
        return bil;
    }

    public void setBil(Bil bil){
        if (this.bil != bil){
            this.ankomst = LocalTime.now();
            this.bil = bil;
        }
    }

    public void removeBil (Bil bil){
        if (this.bil == bil){
            this.bil = null;
            this.ankomst = null;
        }
    }

    //Opgave 5
    public void hentBil(LocalTime afgangstidpunkt){

        double pris = beregnpris(afgangstidpunkt);
        double gammelsaldo = this.parkeringshus.getSaldo();

        double nySaldo = gammelsaldo + pris;

        this.parkeringshus.tilføgsaldo(nySaldo);

        this.bil = null;
    }


    //Get nummer
    public int getNummer(){
        return this.nummer;
    }


    //Beregn pris
    public double beregnpris(LocalTime sluttidspunkt){
        long minutter = ChronoUnit.MINUTES.between(ankomst,sluttidspunkt);
        long tidsbetalinger = minutter / 10;

        if (minutter % 10 > 0){
            tidsbetalinger++;
        }
        return 6 * tidsbetalinger;
    }


}
