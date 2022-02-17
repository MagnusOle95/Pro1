package Opgave3;

public class TestApp {
    public static void main(String[] args) {

        //Opretter indkøbsvogn
        Indkøbsvogn vogn = new Indkøbsvogn();
        Indkøbsvogn vogn2 = new Indkøbsvogn();

        //Opretter bestemt moms.
        Moms_Normal mN = new Moms_Normal();
        Moms_Elartikel mE = new Moms_Elartikel();
        Moms_Fødevare mF = new Moms_Fødevare();
        Moms_Spiritus mS = new Moms_Spiritus();

        //Opretter vare
        Vare bukser = new Vare(200,"Frannys Jeans","Flotte bukser med nyancer",mN);
        Vare Pladstikopper = new Vare(75,"Mega Cups" ,"Store dejlige fyldige kopper",mN);

        Elartikler tv = new Elartikler(4500,"Sonet mega hd 2000" ,"God kvalitet til pengende" ,32,mE);
        Elartikler consol = new Elartikler(2,"May Station 8" ,"Spil de nyeste spil som fx GTU" ,120,mE );

        Fødevare mælk = new Fødevare(9.95,"Mælk fra larla" ,"Dejlig lækker mælk" ,5,mF);
        Fødevare brokoli = new Fødevare(12, "Spansk brokoli","Dejlig brokoli fra de spanke øer" ,8,mF);

        Spiritus VodkaBlaska = new Spiritus(72,"Blukadinga" ,"Nice vodka from Russia" ,37.5,mS);
        Spiritus blingGin = new Spiritus(720,"BlingGin","For guys with no life and too much money" ,42,mS);

        vogn.addVareTilIndkøbsvogn(tv);
        vogn.addVareTilIndkøbsvogn(mælk);
        vogn.addVareTilIndkøbsvogn(bukser);
        vogn.addVareTilIndkøbsvogn(VodkaBlaska);

        System.out.println(vogn.beregnSamledePris());

        System.out.println();

        vogn2.addVareTilIndkøbsvogn(Pladstikopper);
        vogn2.addVareTilIndkøbsvogn(consol);
        vogn2.addVareTilIndkøbsvogn(brokoli);
        vogn2.addVareTilIndkøbsvogn(blingGin);

        System.out.println(vogn2.beregnSamledePris());




    }

}
