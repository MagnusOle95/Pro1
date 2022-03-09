package Opgave4_Super_salg_Butik_Adapter_pattern;

public class App {

    public static void main(String[] args) {
        //Tester klasserne
        Vare vare = new Vare(100,"Guld slik");
        System.out.println(vare.beregnmoms());

        FoedeVare fødevare = new FoedeVare(200,"Luksus øllebrød" );
        System.out.println(fødevare.beregnmoms());

        ElVare elVare1 = new ElVare(2,"Billig el dims");
        ElVare elvare2 = new ElVare(20,"Mellemdyr elvare");
        System.out.println(elVare1.beregnmoms());
        System.out.println(elvare2.beregnmoms());

        // tester adapter. men igen, er det nok.
        Spiritus s1 = new Spiritus(89,"Vodka deluxe");
        NavnOgPrisAdapter nopa = new SpiritusToNavnOgPrisAdapter(s1);

        System.out.println(nopa.getNavn());
        System.out.println(nopa.getMomspris());


    }

}
