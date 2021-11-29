package Opgave4_GeografiskFigur;

public class Kvadrat extends Figure_Data {

    private int Side;

    public Kvadrat(int x, int y, int side) {
        super(x, y);
        Side = side;
    }

    @Override
    public double beregnArealAfFigur(){
        return Side*Side;
    }

    public int getSide(){
        return this.Side;
    }
}
