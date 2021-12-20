package application.model;

import java.time.LocalTime;

public class InvalidePlads extends Parkeringsplads {

    //Attributter
    private double areal;

    //Construktor
    InvalidePlads(int nummer,Parkeringshus parkeringshus,double areal) {
        super(nummer,parkeringshus);
        this.areal = areal;
    }

    @Override
    public double beregnpris(LocalTime sluttidspunkt){
        return 0;
    }

}
