package application.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Tilmelding {

    //Attributer
    private LocalDate ankomstDato;
    private LocalDate afrejseDato;
    private boolean foredragsHolder;


    //Linkattributter
    private ArrayList<Tilvalg> hotelTilvalg;
    private Deltager deltager;
    private Ledsager ledsager;
    private Hotel hotel;
    private Konferrence konferrence;


    //Construktor
    public Tilmelding(LocalDate ankomstDato, LocalDate afrejseDato, Konferrence konferrence, Deltager deltager, boolean foredragsholder) {
        this.ankomstDato = ankomstDato;
        this.afrejseDato = afrejseDato;
        this.konferrence = konferrence;
        this.hotelTilvalg = new ArrayList<>();
        this.deltager = deltager;
        this.deltager.addTilmelding(this);
        this.foredragsHolder = foredragsholder;
    }

    //set og get metoder
    public LocalDate getAnkomstDato() {
        return ankomstDato;
    }

    public void setAnkomstDato(LocalDate ankomstDato) {
        this.ankomstDato = ankomstDato;
    }

    ////////////////////////////////////////////////////////////////////////////////////////

    public LocalDate getAfrejseDato() {
        return afrejseDato;
    }

    public void setAfrejseDato(LocalDate afrejseDato) {
        this.afrejseDato = afrejseDato;
    }

    ///////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    public Konferrence getKonferrence() {
        return konferrence;
    }


    ///////////////////////////////////////////////////////////////////////////////////////

    public void addHotelTilvalg(Tilvalg tilvalg) {
        if (!this.hotelTilvalg.contains(tilvalg)) {
            this.hotelTilvalg.add(tilvalg);
        }
    }

    public void removeHotelTilvalg(Tilvalg tilvalg) {
        if (this.hotelTilvalg.contains(tilvalg)) {
            this.hotelTilvalg.remove(tilvalg);
        }
    }

    public ArrayList<Tilvalg> getHotelTilvalg() {
        return new ArrayList<>(hotelTilvalg);
    }
///////////////////////////////////////////////////////////////////////////////////////////

    public void setDeltager(Deltager deltager) {
        this.deltager = deltager;
    }

    public Deltager getDeltager() {
        return this.deltager;
    }

    ////////////////////////////////////////////////////////////////////////////
    //Ledsager
    public Ledsager createLedsager(String navn) {
        Ledsager ledsager = new Ledsager(navn,this);
        this.ledsager = ledsager;
        return ledsager;
    }

    public Ledsager getLedsager(){
        return  this.ledsager;
    }
    //////////////////////////////////////////////////////////////////////////

    public boolean getFordragsholder(){
        return  this.foredragsHolder;
    }

    //////////////////////////////////////////////////////////////////////////
    //Ledsager
    public void setHotel(Hotel hotel) {
        if (this.hotel != hotel) {
            if (this.hotel != null) {
                this.hotel.removeTildmelding(this);
            }
            this.hotel = hotel;
            if (hotel != null) {
                hotel.addTilmeldinger(this);
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){
        return "Navn: " + deltager.getNavn() + " Konferrencer: " + konferrence;
    }
    ///////////////////////////////////////////////////////////////////////////

    //Udregn samlede pris for tilmelding af deltager, ledsager, hotel - hotel tilvalg og udflugter.
    public double getSamledePris() {
        double sum = 0;
        double dage = ChronoUnit.DAYS.between(ankomstDato, afrejseDato) + 1;
        double dagspris = konferrence.getDagsPris();

        if (!foredragsHolder) {
            sum += dagspris * dage;
        }

        if (hotel != null) {
            if (ledsager != null) {
                    sum += hotel.getDobbeltVærelsesPris() * (dage - 1);
                } else {
                    sum += hotel.getEnkeltVærelsesPrisPris() * (dage - 1);
                }

                if (hotelTilvalg != null) {
                    for (Tilvalg valg : hotelTilvalg) {
                        sum += valg.getPris() * (dage - 1);
                    }
                }
            }

        if (ledsager != null) {
            if (ledsager.getUdflugter() != null) {
                for (Udflugt udflugt : ledsager.getUdflugter()) {
                    sum += udflugt.getPris();
                    }
                }
            }

        return sum;
    }


}

