package stars_Opgave_4;

public class Stars {
    final int MAX_ROWS = 10;

    public void starPicture() {
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    int antalRunder = 10;

    public void starPictureA() {
        // TODO
        for (int row = 1; row <= MAX_ROWS; row++, antalRunder--) {
            for (int star = 1; star <= antalRunder; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    int antalspace = 9;
    int antalStjerner = 1;

    public void starPictureB() {
        for (int row = 1; row <= MAX_ROWS; row++, antalspace--, antalStjerner++) {

            for (int space = 1; space <= antalspace; space++) {
                System.out.print("-");
            }
            for (int stars = 1; stars <= antalStjerner; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    int antalStjerner2 = 10;
    int antalSpace2 = 0;

    public void starPictureC() {
        for (int row = 1; row <= MAX_ROWS; row++, antalSpace2++, antalStjerner2--) {

            for (int space = 1; space <= antalSpace2; space++) {
                System.out.print("-");
            }
            for (int stars = 1; stars <= antalStjerner2; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    int antalStjerner3 = 1;
    int antalspace3 = 4;


    public void starPictureD() {
        for (int row = 1; antalspace3 >= 1; row++) {

            for (int space = 1; space <= antalspace3; space++) {
                System.out.print("-");
            }
            for (int stars = 1; stars <= antalStjerner3; stars++) {
                System.out.print("*");
            }
            System.out.println();
            antalspace3--;
            antalStjerner3 = antalStjerner3 + 2;
        }

        for (int row = 1; antalspace3 <= 4; row++) {

            for (int space = 1; space <= antalspace3; space++) {
                System.out.print("-");
            }
            for (int stars = 1; stars <= antalStjerner3; stars++) {
                System.out.print("*");
            }
            System.out.println();
            antalspace3++;
            antalStjerner3 = antalStjerner3 - 2;
        }

    }
}





