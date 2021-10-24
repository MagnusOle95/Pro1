package afleveringfravær;

import javax.sound.sampled.SourceDataLine;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravaer21S = { { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 } };

        FravaersSystem fraværsSystem = new FravaersSystem();
        fraværsSystem.udskrivFravaer(fravaer21S);
        System.out.println();

        //TODO opgave 7

        //Testing method samletFravær//
        System.out.println("Elev 1's fravær: " + fraværsSystem.samletFravaer(fravaer21S,4));

        //Testing method gennemsnit//
        System.out.println("Elev 1's gennemsnitlige fravær hver måned: " + fraværsSystem.gennemsnit(fravaer21S,1 ));

        //Testing method antalUdenFravaer//
        System.out.println("Antal elever uden fraværd: " + fraværsSystem.antalUdenFravaer( fravaer21S));

        //Testing method mestFravaer//
        System.out.println("Elev med mest fravær: " + fraværsSystem.mestFravaer(fravaer21S));

        //Testing method nulstil//
        fraværsSystem.nulstil(fravaer21S,4 );
        fraværsSystem.udskrivFravaer(fravaer21S);
    }
}
