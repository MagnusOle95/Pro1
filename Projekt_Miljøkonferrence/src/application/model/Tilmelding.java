package application.model;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private static double dagspris;


    //Construktor
    public Tilmelding(LocalDate ankomstDato, LocalDate afrejseDato, Konferrence konferrence, Deltager deltager, boolean foredragsholder) {
        this.ankomstDato = ankomstDato;
        this.afrejseDato = afrejseDato;
        this.konferrence = konferrence;
        this.hotelTilvalg = new ArrayList<>();
        this.deltager = deltager;
        this.foredragsHolder = foredragsholder;
        dagspris = 1500;
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

    public double getPris() {
        return dagspris;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    public Konferrence getKonferrence() {
        return konferrence;
    }

    public void setKonferrence(Konferrence konferrence) {
        if (this.konferrence != konferrence) {
            if (this.konferrence != null) {
                this.konferrence.removeTilmelding(this);
            }
            this.konferrence = konferrence;
            if (konferrence != null) {
                konferrence.addTilmelding(this);
            }
        }
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
    public void setLedsager(Ledsager ledsager) {
        if (this.ledsager != ledsager) {
            if (this.ledsager != null) {
                this.ledsager.removeTilmelding(this);
            }
            this.ledsager = ledsager;
            if (ledsager != null) {
                ledsager.addTilmelding(this);
            }
        }
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

    //Udregn samlede pris for tilmelding af deltager, ledsager, hotel - hotel tilvalg og udflugter.
    public double getSamledePris() {
        double sum = 0;
        double dage = ChronoUnit.DAYS.between(ankomstDato, afrejseDato);

        if (!foredragsHolder) {
            sum += dagspris * dage;
        }

        if (hotel != null) {
            if (ledsager != null) {
                    sum += hotel.getDobbeltVærelsesPris() * dage;
                } else {
                    sum += hotel.getEnkeltVærelsesPrisPris() * dage;
                }

                if (hotelTilvalg != null) {
                    for (Tilvalg valg : hotelTilvalg) {
                        sum += valg.getPris() * dage;
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

