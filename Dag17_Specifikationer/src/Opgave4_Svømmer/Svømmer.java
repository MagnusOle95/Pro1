package Opgave4_Svømmer;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Modellerer en svømmer
 */
public class Svømmer {
    private String navn;
    private String klub;
    private LocalDate fødselsdag;
    private ArrayList<Double> tider;
    private boolean[] tiderDårlig;

    /**
     * Initialiserer en ny svømmer med navn, fødselsdag, klub
     * og tider.
     * Pre: længden af tider er mindst 2
     */
    public Svømmer(String name, LocalDate fødselsdag, String Klub, ArrayList<Double> tider) {
        if (tider.size() >= 2) {
            this.navn = name;
            this.klub = Klub;
            this.fødselsdag = fødselsdag;
            this.tider = tider;
            tiderDårlig = new boolean[tider.size()];
        }
    }

    /**
     * Returnerer svømmerens navn.
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Returnerer svømmerens årgang.
     */
    public int getÅrgang() {
        return fødselsdag.getYear() % 100;
    }

    /**
     * Returnerer svømmerens klub.
     */
    public String getKlub() {
        return klub;
    }

    /**
     * Registrerer svømmerens klub
     *
     * @param klub
     */
    public void setKlub(String klub) {
        this.klub = klub;
    }

    /**
     * Returnerer den hurtigste tid svømmeren har opnået
     * Pre: Der er registreret mindst to tider for svømmeren
     */
    public double bedsteTid() {
        double bedsteTid = tider.get(0);

        for (int i = 1; i < tider.size(); i++) {
            if (bedsteTid > tider.get(i)) {
                bedsteTid = tider.get(i);
            }
        }
        return bedsteTid;
    }

    /**
     * Returnerer gennemsnittet af de tider svømmeren har
     * opnået
     * Pre: Der er registreret mindst to tider for svømmeren
     */
    public double gennemsnitAfTid() {
        double sum = 0;
        for (int i = 0; i < tider.size(); i++) {
            sum += tider.get(i);
        }
        return sum / tider.size();
    }

    /**
     * Returnerer gennemsnittet af de tider svømmeren har
     * opnået idet den langsomste tid ikke er medregnet
     * Pre: Der er registreret mindst to tider for svømmeren
     */
    public double snitUdenDårligste() {

        return -1;
    }
}

