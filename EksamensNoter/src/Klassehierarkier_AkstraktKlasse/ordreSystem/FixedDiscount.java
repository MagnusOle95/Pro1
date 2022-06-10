package Klassehierarkier_AkstraktKlasse.ordreSystem;

public class FixedDiscount extends Discount {

    //attributer
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price){
        double sum = 0;
        if (price > discountLimit){
            sum = fixedDiscount;
        }
        return sum;
    }



}
