package Opgave4_GeografiskFigur;

public class TestApp {
    public static void main(String[] args) {

        //Opretter figure
        Cirkel f1 = new Cirkel(5,5 ,10);
        Eclipse f2 = new Eclipse(10,10  ,10 ,20);
        Kvadrat f3 = new Kvadrat(15, 15,5 );
        Retangel f4 = new Retangel(20, 20,5 ,10 );

        //Uregner arealer af de forskellige figure
        System.out.println("f1: " + f1.beregnArealAfFigur());
        System.out.println("f2: " + f2.beregnArealAfFigur());
        System.out.println("f3: " + f3.beregnArealAfFigur());
        System.out.println("f4: " + f4.beregnArealAfFigur());

        //Parralelforskyder figure.
        System.out.println(f1.toString());
        f1.ParalelforskydFigure(20,20 );
        System.out.println(f1.toString());
        f1.ParalelforskydFigure(-10,-5 );
        System.out.println(f1.toString());
    }
}
