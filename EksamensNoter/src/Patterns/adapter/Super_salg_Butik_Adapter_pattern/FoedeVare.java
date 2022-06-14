package Patterns.adapter.Super_salg_Butik_Adapter_pattern;

public class FoedeVare extends Vare{

    //Cunstruktor
    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    //Methodes
    @Override
    public double beregnmoms() {
        return super.getPris() * 0.05;
    }
}
