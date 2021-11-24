package Opgave4_GeografiskFigur;

public class Eclipse extends Cirkel {

    private int radius2;

    public Eclipse(int x, int y, int radius, int radius2) {
        super(x, y, radius);
        this.radius2 = radius2;
    }

    @Override
    public double beregnArealAfFigur(){
        return Math.PI * super.getRadius() * radius2;
    }

}
