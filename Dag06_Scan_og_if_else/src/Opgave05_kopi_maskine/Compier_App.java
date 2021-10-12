package Opgave05_kopi_maskine;

public class Compier_App {
    public static void main(String[] args) {

        //Makecopy og program test//
        Copier printer1 = new Copier(1);
        printer1.makecopy();
        System.out.println(printer1.getpaper() + "\n");

        printer1.makecopy();
        System.out.println(printer1.getpaper() + "\n");

        printer1.insertPaper(30);
        System.out.println(printer1.getpaper() + "\n");

        printer1.makecopy();
        System.out.println(printer1.getpaper() + "\n");

        printer1.insertPaper(173);
        System.out.println(printer1.getpaper() + "\n");

        printer1.insertPaper(300);
        System.out.println(printer1.getpaper() + "\n");


        //Makecopy3 og program test//
        printer1.makecopy3(100);
        System.out.println(printer1.getpaper() + "\n");


        //Makecopy2 og program test//
        printer1.makecopy2();
        System.out.println(printer1.getpaper() + "\n");

        printer1.makecopy2();
        System.out.println(printer1.getpaper() + "\n");

        printer1.makecopy2();
        System.out.println(printer1.getpaper() + "\n");


        //Test af paperJam og fixJam//
        System.out.println("Test med Paper jam og fixjam");
        printer1.makepaperjam();
        printer1.makecopy2();
        System.out.println(printer1.getpaper() + "\n");

        printer1.makecopy2();
        System.out.println(printer1.getpaper() + "\n");

        printer1.fixJam();
        printer1.makecopy2();
        System.out.println(printer1.getpaper() + "\n");

        printer1.makecopy2();
        System.out.println();
        System.out.println(printer1.getpaper() + "\n");
    }
}
