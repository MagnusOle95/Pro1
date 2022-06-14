package Opgave5_boghandel;

public class Indkøber implements Observer {

    private String navn;

    public Indkøber(Subject o, String navn) {
        this.navn = navn;
        o.registerObserver(this);
    }

    public void update(Subject o) {
        int b = ((BogTitle) o).getAntal();
        if (b < 6) {
            System.out.println("mindre end 6 af denne bog, der skal indkøbes flere");
        }
    }


}

