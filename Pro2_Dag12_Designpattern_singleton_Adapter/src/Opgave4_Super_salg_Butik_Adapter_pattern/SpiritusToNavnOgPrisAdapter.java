package Opgave4_Super_salg_Butik_Adapter_pattern;

public class SpiritusToNavnOgPrisAdapter implements NavnOgPrisAdapter {

    private Spiritus spiritus;

    public SpiritusToNavnOgPrisAdapter(Spiritus spiritus){
        this.spiritus = spiritus;
    }

    public String getNavn(){
        return spiritus.getBetgenelse();
    }

    public double getMomspris(){
        return spiritus.hentMoms();
    }




}
