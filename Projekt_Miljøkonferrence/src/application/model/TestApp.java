package application.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestApp {
    public static void main(String[] args) {

        //Opretter konference
        Konferrence konferrence = new Konferrence(LocalDate.of(2021,12 ,18),LocalDate.of(2021,12 ,20),"Hav og Himmel","Odense Universitet");

        //Opretter hotellerne
        Hotel hotel1 = new Hotel("Den hvide svane","Lars Mogensen" ,1050 ,1250);
        Tilvalg h1t1 = hotel1.createTilvalg("Bad","Bad på alle værelser" ,0);
        Tilvalg h1t2 = hotel1.createTilvalg("WIFI","Trådløst internet" ,50);

        Hotel hotel2 = new Hotel("Hotel phøniks","Jens Mogensen" ,700 ,800);
        Tilvalg h2t1 = hotel2.createTilvalg("Bad","Brusebad på gangen",200);
        Tilvalg h2t2 = hotel2.createTilvalg("WIFI","Trådløst internet",75);

        Hotel hotel3 = new Hotel("Pension tusidegryd","Gert Hansen" ,500 ,600);
        Tilvalg h3t1 = hotel3.createTilvalg("Morgenmad","Bacon og ægg og en kop kaffe",100);

        //Opretter deltager
        Deltager d1 = new Deltager("Finn Madsen","Hans Ibs Gade" ,"Horsens" ,"Danmark" ,30298734);
        Deltager d2 = new Deltager("Niels Petersen","Tiang street" ,"Bejsur" ,"Framstadt" ,888777999 );

        //Opretter ledsager


        //Opretter udflugter


        //Opretter foredrag


        //Opretter tilmelding
        Tilmelding t1 = new Tilmelding(LocalDate.of(2021,12 ,18),LocalDate.of(2021,12 ,20),konferrence,d1 ,false );
        System.out.println("Samlede pris for Finn Madsen Tilmelding 1: " + t1.getSamledePris());

        Tilmelding t2 = new Tilmelding(LocalDate.of(2020,12 ,18 ),LocalDate.of(2020,12 ,20 ) ,konferrence ,d2 ,false);
        t2.setHotel(hotel1);
        System.out.println("Samlede pris for Niels Petersen tilmelding 2: " + t2.getSamledePris());

    }
}
