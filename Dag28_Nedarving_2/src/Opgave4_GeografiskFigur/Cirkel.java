package Opgave4_GeografiskFigur;

public class Cirkel extends Figure_Data {

    private int radius;

    public Cirkel(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double beregnArealAfFigur(){
        return Math.PI * (radius*radius);
    }

    public int getRadius(){
        return this.radius;
    }

}
