package Opgave3;

public class Elartikler extends Vare {

    private int energiForbrugPrTimeIKw;

    public Elartikler(double prisExMoms, String vareNavn, String beskrivelse, int energiForbrugPrTimeIKw,Moms moms) {
        super(prisExMoms, vareNavn, beskrivelse,moms);
        this.energiForbrugPrTimeIKw = energiForbrugPrTimeIKw;
    }

    @Override
    public double beregnPris(){
        return super.getMoms().beregnPris(super.getPrisExMoms());
    }

    @Override
    public String toString(){
        return super.toString() + " Energiforbrug i Kwh: " + energiForbrugPrTimeIKw;
    }
}
