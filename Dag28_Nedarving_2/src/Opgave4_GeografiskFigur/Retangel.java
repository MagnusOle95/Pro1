package Opgave4_GeografiskFigur;

public class Retangel extends Kvadrat {

    private int side2;

    public Retangel(int x, int y, int side, int side2) {
        super(x, y, side);
        this.side2 = side2;
    }

    @Override
    public double beregnArealAfFigur(){
        return super.getSide() * this.side2;
    }
}
