package interfaces.Ordresystem_Discount_Interface;

public class AgeDiscount implements Discount {

    //attribut
    private int kundeAlder;

    public AgeDiscount(int kundealder){
        this.kundeAlder = kundealder;
    }

    @Override
    public double getDiscount(double price){
        return price * (kundeAlder / 100.0);
    }



}
