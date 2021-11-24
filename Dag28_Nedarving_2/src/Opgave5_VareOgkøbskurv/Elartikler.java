package Opgave5_VareOgkøbskurv;

public class Elartikler extends Vare {

    private int energiForbrugPrTimeIKw;

    public Elartikler(double prisExMoms, String vareNavn, String beskrivelse, int energiForbrugPrTimeIKw) {
        super(prisExMoms, vareNavn, beskrivelse);
        this.energiForbrugPrTimeIKw = energiForbrugPrTimeIKw;
    }

    @Override
    public double beregnPris(){
        double sum;
        double moms = super.getPrisExMoms() * 0.30;
        if (moms < 3){
            sum = super.getPrisExMoms() + 3;
        }else{
            sum = super.getPrisExMoms() * 1.30;
        }
        return sum;
    }

    @Override
    public String toString(){
        return super.toString() + " Energiforbrug i Kwh: " + energiForbrugPrTimeIKw;
    }
}
