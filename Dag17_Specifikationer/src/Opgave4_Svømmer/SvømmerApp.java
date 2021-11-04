package Opgave4_Svømmer;

import java.time.LocalDate;
import java.util.ArrayList;

public class SvømmerApp {
    public static void main(String[] args) {
        LocalDate fødelsdag = LocalDate.of(1995,9 ,16 );
        ArrayList<Double> s1Tider = new ArrayList<>();
        s1Tider.add(2.35);
        s1Tider.add(2.23);
        s1Tider.add(2.45);
        s1Tider.add(2.21);
        Svømmer s1 = new Svømmer("Magnus",fødelsdag ,"Dianalund",s1Tider);

        System.out.println("Navnet på svømmer 1: " + s1.getNavn());

        System.out.println("Årgangen for svømmer 1: " + s1.getÅrgang());

        System.out.println("Klub navnet for svømmer 1: " + s1.getKlub());

        s1.setKlub("Slagelse");

        System.out.println("Nye klub navn svømmer 1: " + s1.getKlub());

        System.out.println("Svømmer 1 bedste tid: " + s1.bedsteTid());

        System.out.println("Svømmer 1 gennemsnits tid: " + s1.gennemsnitAfTid());

        System.out.println("Svømmer 1 gennemsnits tid, uden den dårligste tid: ");


        System.out.println("Tester om tider er ændret: " + s1.gennemsnitAfTid());








    }
}
