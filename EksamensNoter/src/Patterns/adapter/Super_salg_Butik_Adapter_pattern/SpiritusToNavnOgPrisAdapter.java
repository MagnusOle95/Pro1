package Patterns.adapter.Super_salg_Butik_Adapter_pattern;

public class SpiritusToNavnOgPrisAdapter extends Vare {

    private Spiritus spiritus;

    public SpiritusToNavnOgPrisAdapter(Spiritus spiritus){
        super(0,null);
        this.spiritus = spiritus;
    }

    @Override
    public String getNavn(){
        return spiritus.getBetgenelse();
    }

    @Override
    public double beregnmoms() {
        return spiritus.hentMoms();
    }






}
