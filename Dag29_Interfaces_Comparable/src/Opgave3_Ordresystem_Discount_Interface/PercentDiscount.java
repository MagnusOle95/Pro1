package Opgave3_Ordresystem_Discount_Interface;

public class PercentDiscount implements Discount {

    //Attributer
    private int discountpercentage;

    public PercentDiscount(int discountpercentage) {
        this.discountpercentage = discountpercentage;
    }

    @Override
    public double getDiscount(double price){
        return price * (discountpercentage/100.0);
    }



}
