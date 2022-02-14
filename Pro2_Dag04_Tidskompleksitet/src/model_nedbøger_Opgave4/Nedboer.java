package model_nedbøger_Opgave4;


public class Nedboer {

    public static void main(String[] args) {
        System.out.println(bedsteTreFerieUger());

        System.out.println(bedsteFerieUgerStart(5));

        System.out.println(ensNedboer());

    }


    private static int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            24, 24, 24, 24, 24};

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    public static int bedsteTreFerieUger() {
        // TODO return -1 kun indsat så der ikke er compile fejl
        int sumRegn = 0;
        int mindstregn = Integer.MAX_VALUE;
        int ugenr = 0;

        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            sumRegn = nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];

            if (sumRegn < mindstregn) {
                mindstregn = sumRegn;
                ugenr = i + 1;
            }
        }
        return ugenr;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    public static int bedsteFerieUgerStart(int antal) {
        // TODO return -1 kun indsat så der ikke er compile fejl
        int sumRegn;
        int mindstregn = Integer.MAX_VALUE;
        int ugenr = 0;

        for (int i = 0; i <= nedboerPrUge.length - antal; i++) {
            sumRegn = 0;

            for (int j = 0; j < antal; j++) {
                sumRegn += nedboerPrUge[i + j];
            }

            if (sumRegn < mindstregn) {
                mindstregn = sumRegn;
                ugenr = i + 1;
            }
        }

        return ugenr;
    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public static int ensNedboer() {
        // TODO return -1 kun indsat så der ikke er compile fejl
        int maxAntalUger = 1;
        int ugenr = 0;
        int count;
        int i = 0;

        while (i < nedboerPrUge.length - 1){
            count = 1;


            while (i + count < nedboerPrUge.length && nedboerPrUge[i] == nedboerPrUge[i + count]){
                count++;
            }

            if (maxAntalUger < count) {
                maxAntalUger = count;
                ugenr = i + 1;
            }

            i += count;

        }
        return ugenr;
    }

}
