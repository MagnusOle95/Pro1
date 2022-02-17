package Opgave3;

public class Moms_Elartikel implements Moms {


    //Construktor
    public Moms_Elartikel(){}

    @Override
    public double beregnPris(double prisUdenMoms) {
        double sum;
        double moms = prisUdenMoms * 0.30;
        if (moms < 3){
            sum = prisUdenMoms + 3;
        }else{
            sum = prisUdenMoms * 1.30;
        }
        return sum;
    }

}
