package Opgave3;

public class Moms_Spiritus implements Moms {

    //Construktor
    public Moms_Spiritus(){};

    @Override
    public double beregnPris(double prisUdenMoms){
        double sum;
        if (prisUdenMoms > 90){
            sum = prisUdenMoms * 2.2;
        }else{
            sum = prisUdenMoms* 1.8;
        }
        return sum;
    }


}
