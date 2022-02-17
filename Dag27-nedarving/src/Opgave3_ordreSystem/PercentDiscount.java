package Opgave3_ordreSystem;

public class PercentDiscount extends Discount{

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
