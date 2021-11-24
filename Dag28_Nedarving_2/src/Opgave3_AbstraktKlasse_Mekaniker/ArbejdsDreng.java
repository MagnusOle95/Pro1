package Opgave3_AbstraktKlasse_Mekaniker;

public class ArbejdsDreng extends Ansat{

    public ArbejdsDreng (String navn, String Adresse,Double timeløn){
        super(navn,Adresse,timeløn);
    }

    @Override
    public double beregnLoen() {
        return super.getTimeløn() * 25;
    }
}
