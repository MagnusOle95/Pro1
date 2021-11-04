package Opgave3;

public class Car {

    private String license;
    private double pricePerDay;
    private int purcaseYear;

    public Car(String license, int year){
        this.license = license;
        this.purcaseYear = year;
    }

    public void setDayPrice(Double price){
        this.pricePerDay = price;
    }

    public double getDayPrice(){
        return this.pricePerDay;
    }

    public String getLicense(){
        return license;
    }

    public int getPurcaseYear(){
        return purcaseYear;
    }

}
