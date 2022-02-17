package Opgave3;

public class Moms_Fødevare implements Moms {

    //Construktor
    public Moms_Fødevare(){}

    @Override
    public double beregnPris(double prisUdenMoms){
        return prisUdenMoms * 1.05;
    }




}
