package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Konferrence crateKonferrence(LocalDate startDato, LocalDate slutDato, String konferrenceNavn, String Location) {
        Konferrence konferrence = new Konferrence(startDato, slutDato, konferrenceNavn, Location);
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

    public static ArrayList<Tilvalg> getTilvalg (Hotel hotel){
        return new ArrayList<>(hotel.getTilValg());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Foredrag createForedrag(String foredragsNavn,Konferrence konferrence){
        Foredrag foredrag = konferrence.createFordrag(foredragsNavn);
        return foredrag;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Udflugt createUdflugt(double pris, String placering, String type, LocalDate dato,Konferrence konferrence){
        Udflugt udflugt = konferrence.createUdflugt(pris,placering,type ,dato);
        return udflugt;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Tilmelding createTilmelding(LocalDate ankomstDato, LocalDate afrejseDato,Deltager deltager, boolean foredragsholder,Konferrence konferrence){
        Tilmelding tilmelding = konferrence.createTilmelding(ankomstDato,afrejseDato ,deltager ,foredragsholder);
        return tilmelding;
    }

    public static void setDeltagerTilTilmelding(Deltager deltager, Tilmelding tilmelding){
        tilmelding.setDeltager(deltager);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Deltager createDeltager(String navn,String adresse, String by, String land, int tlfNr){
        Deltager deltager = new Deltager(navn,adresse , by,land ,tlfNr);
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

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public static void initstorage() {
        Konferrence k1 = Controller.crateKonferrence(LocalDate.of(2021, 12,18 ),LocalDate.of(2021,12 ,18) ,"Hav og Himmel" ,"Odense Universitet");

        Hotel h1 = Controller.createHotel("Den hvide Svane", "Gert Mogensen", 1050, 1250);
        Tilvalg h1t1 = Controller.createTilvalg("WIFI", "Trådløst internet", 50, h1);

        Hotel h2 = Controller.createHotel("Hotel Phønix", "Jan Jensen", 700, 800);
        Tilvalg h2t1 = Controller.createTilvalg("Bad", "Et dejligt koldt bad", 200, h2);
        Tilvalg h2t2 = Controller.createTilvalg("WIFI", "Trådløst internet", 75, h2);


        Hotel h3 = Controller.createHotel("Pension Tusindefryd", "Ham Hamsen", 500, 600);
        Tilvalg h3t1 = Controller.createTilvalg("Morgenmad", "Nyd dejlige ægg med 4 små pølser", 100, h3);

        //Opretter deltagere
        Deltager d1 = Controller.createDeltager("Bent hansen", "Solvænget", "Vildstrup", "Danmark", 20202020);
        Deltager d2 = Controller.createDeltager("Sidsel squrepants", "Pineapple street", "Bikinibutton", "Havet", 1122334455);

        //Oprette tilmeldinger
        Tilmelding t1 = Controller.createTilmelding(LocalDate.of(2021,12 ,18 ),LocalDate.of(2021,12 ,20),d1,false,k1);
        Controller.addTilmeldingTilHotel(t1,h1);
        Controller.setDeltagerTilTilmelding(d1,t1 );

        Tilmelding t2 = Controller.createTilmelding(LocalDate.of(2021,12 ,18 ),LocalDate.of(2021,12 ,20),d2,false,k1);
        Controller.addTilmeldingTilHotel(t2,h1);
        Controller.setDeltagerTilTilmelding(d2,t2);
    }

    public static void init(){
        initstorage();
    }

}
