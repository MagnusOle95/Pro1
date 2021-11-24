package application.controller;

import application.model.*;
import guifx.KonferencePane;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Konferrence crateKonferrence(LocalDate startDato, LocalDate slutDato, String konferrenceNavn, String Location,double pris) {
        Konferrence konferrence = new Konferrence(startDato, slutDato, konferrenceNavn, Location,pris);
        Storage.addKonferrence(konferrence);
        return konferrence;
    }

    public static ArrayList<Konferrence> getKonferrencer() {
        return Storage.getKonferrencer();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Hotel createHotel (String hotelNavn, String hotelBestyrre, double enkeltværelsespris, double dobbeltværelsesPris){
        Hotel hotel = new Hotel(hotelNavn,hotelBestyrre ,enkeltværelsespris ,dobbeltværelsesPris);
        Storage.addHotel(hotel);
        return hotel;
    }

    public static ArrayList<Hotel> getHoteller (){
        return Storage.getHoteller();
    }

    public static void addTilmeldingTilHotel(Tilmelding tilmelding, Hotel hotel){
        hotel.addTilmeldinger(tilmelding);
    }

    public static ArrayList<String> getHotellerNavn(){
        ArrayList<String> hotelNavne = new ArrayList<>();
        for (Hotel navne : getHoteller())
            hotelNavne.add(navne.getHotelNavn());
        return hotelNavne;
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Tilvalg createTilvalg(String navn, String beskrivelse, double pris, Hotel hotel){
        Tilvalg tilvalg = hotel.createTilvalg(navn,beskrivelse ,pris);
        return  tilvalg;
    }

    public static void addTilvalgToTilmelding(Tilvalg tilvalg, Tilmelding tilmelding){
        tilmelding.addHotelTilvalg(tilvalg);
    }

    public static ArrayList<Tilvalg> getTilvalg (Hotel hotel){
        return new ArrayList<>(hotel.getTilValg());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Udflugt createUdflugt(double pris, String placering, String type, LocalDate dato,Konferrence konferrence){
        Udflugt udflugt = konferrence.createUdflugt(pris,placering,type ,dato);
        return udflugt;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Tilmelding createTilmelding(LocalDate ankomstDato, LocalDate afrejseDato,Deltager deltager, boolean foredragsholder,Konferrence konferrence,Hotel hotel){
        Tilmelding tilmelding = new Tilmelding (ankomstDato,afrejseDato ,konferrence,deltager ,foredragsholder);
        tilmelding.setHotel(hotel);
        return tilmelding;
    }

    public static void setDeltagerTilTilmelding(Deltager deltager, Tilmelding tilmelding){
        tilmelding.setDeltager(deltager);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Deltager createDeltager(String navn,String adresse, String land, int tlfNr){
        Deltager deltager = new Deltager(navn,adresse,land ,tlfNr);
        Storage.addDeltager(deltager);
        return deltager;
    }

    public static ArrayList<Deltager> getDeltagere(){
        return Storage.getDeltagere();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Ledsager createLedsager(String navn,Tilmelding tilmelding) {
        Ledsager ledsager = tilmelding.createLedsager(navn);
        return ledsager;
    }

    public static void addLedsagerToUdflugt(Ledsager ledsager, Udflugt udflugt){
        ledsager.addUdflugt(udflugt);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////


    public static void initstorage() {
        Konferrence k1 = Controller.crateKonferrence(LocalDate.of(2021, 12,18 ),LocalDate.of(2021,12 ,18) ,"Hav og Himmel" ,"Odense Universitet",2000);

        Hotel h1 = Controller.createHotel("Den hvide Svane", "Gert Mogensen", 1050, 1250);
        Tilvalg h1t1 = Controller.createTilvalg("WIFI", "Trådløst internet", 50, h1);

        Hotel h2 = Controller.createHotel("Hotel Phønix", "Jan Jensen", 700, 800);
        Tilvalg h2t1 = Controller.createTilvalg("Bad", "Et dejligt koldt bad", 200, h2);
        Tilvalg h2t2 = Controller.createTilvalg("WIFI", "Trådløst internet", 75, h2);


        Hotel h3 = Controller.createHotel("Pension Tusindefryd", "Ham Hamsen", 500, 600);
        Tilvalg h3t1 = Controller.createTilvalg("Morgenmad", "Nyd dejlige ægg med 4 små pølser", 100, h3);

        //Opretter deltagere
        Deltager d1 = Controller.createDeltager("Bent hansen", "Solvænget","Danmark", 20202020);
        Deltager d2 = Controller.createDeltager("Sidsel squrepants", "Pineapple street", "Havet", 1122334455);

        //Oprette tilmeldinger
        Tilmelding t1 = Controller.createTilmelding(LocalDate.of(2021,12 ,18 ),LocalDate.of(2021,12 ,20),d1,false,k1,h1);

        Tilmelding t2 = Controller.createTilmelding(LocalDate.of(2021,12 ,18 ),LocalDate.of(2021,12 ,20),d2,false,k1,h2);

        //Opretter ledsager
        Ledsager l1 = Controller.createLedsager("Hans",t1);
        Ledsager l2 = Controller.createLedsager("Jens",t2 );


        //Opretter udflugt
        Udflugt u1 = Controller.createUdflugt(200,"Randers" ,"Sjov" ,LocalDate.of(2021,12 ,2 ) ,k1 );
        Controller.addLedsagerToUdflugt(l1,u1);
        Controller.addLedsagerToUdflugt(l2,u1 );
    }

    public static void init(){
        initstorage();
    }


}
