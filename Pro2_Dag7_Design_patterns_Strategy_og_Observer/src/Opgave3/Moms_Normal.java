package Opgave3;

public class Moms_Normal implements Moms {

    //Construktor
    public Moms_Normal(){}

    @Override
    public double beregnPris(double prisUdenMoms) {
        return prisUdenMoms * 1.25;
    }

}
