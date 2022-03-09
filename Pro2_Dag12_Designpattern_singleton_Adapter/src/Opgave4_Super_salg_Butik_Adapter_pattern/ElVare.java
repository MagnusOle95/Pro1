package Opgave4_Super_salg_Butik_Adapter_pattern;

public class ElVare extends Vare {

    //Construktor
    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    //Methodes
    @Override
    public double beregnmoms() {
        double momsPris = super.getPris() * 0.30;
        if (momsPris < 3){
            momsPris = 3;
        }
        return momsPris;
    }

}
