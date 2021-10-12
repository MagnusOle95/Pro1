package Opgave05_kopi_maskine;

import java.util.Scanner;

public class Copier {
    private int paper;
    private boolean paperStuck;

    //constructer 1 uden parameter//
    public Copier(){
    }


    //construkter 2 med parameter//
    public Copier(int paper){
        this.paper = paper;
    }


    //Put papir i printeren, max 500 strykker papir i printeren//
    public void insertPaper(int paper){
        if ((this.paper + paper) > 500){
            System.out.println("Printer fuld kan ikke lade sig gøre");
        }else {
            this.paper = this.paper + paper;
        }
    }


    //Forespørg om papir i printeren//
    public int getpaper(){
        return paper;
    }


    //fortæl printer du vil lave en kopi til printer//
    public void makecopy(){
        if (paperStuck == true){
            System.out.println("Paper stuck in the printer, try to remove it before print");
        } else if (paper == 0){
            System.out.println("Printer empty, out of paper");
        }else{
            System.out.println("Ny lækker print");
            this.paper--;
        }
    }


    //Fortæl printer hvor mange print du ønsker, men med scan//
    public void makecopy2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvor mange kopier vil du lave?");
        int antalØnskedeKopier = scan.nextInt();

        if (paperStuck == true){
            System.out.println("Paper stuck in the printer, try to remove it before print");
        } else if (antalØnskedeKopier > paper) {
            System.out.println("ikke nok papir til det ønskede print");
        } else {
            System.out.println("Nyt lækker print");
            this.paper = this.paper - antalØnskedeKopier;
        }
    }


    //Fortæl printer hvor mange print du ønsker//
    public void makecopy3(int antaKopier){
        if (paperStuck == true){
            System.out.println("Paper stuck in the printer, try to remove it before print");
        } else if (antaKopier > paper) {
            System.out.println("ikke nok papir til det ønskede print");
        } else {
            System.out.println("Nyt lækker print");
            this.paper = this.paper - antaKopier;
        }
    }


    //Make a Paper jam in the printer//
    public void makepaperjam(){
        this.paperStuck = true;
    }

    //Fix the paper jam in the printer//
    public void fixJam(){
        this.paperStuck = false;
    }


}



