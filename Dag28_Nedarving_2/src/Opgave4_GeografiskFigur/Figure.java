package Opgave4_GeografiskFigur;

public abstract class Figure {

    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double beregnArealAfFigur();

    public void ParalelforskydFigure(int a, int b){
        this.x = this.x + a;
        this.y = this.y + b;
    }

    public String toString (){
        return "x: " + this.x + " y: " + this.y;
    }

}