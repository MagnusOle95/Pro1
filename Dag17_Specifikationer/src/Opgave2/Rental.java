package Opgave2;

import java.time.LocalDate;

public class Rental {

    //Attributer//
    private int idNumber;
    private int days;
    private LocalDate startDate;
    private double price;

    public Rental(int idNumber,int days,double price,LocalDate startDate){
        this.idNumber = idNumber;
        this.days = days;
        this.price = price;
        this.startDate = startDate;
    }

    public double getPricePrDay(){
        return price;
    }

    public void setDays(int days){
        this.days = days;
    }

    public int getDays(){
        return days;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getEndDate(){
        return startDate.plusDays(days);
    }

    public double getTotalPrice(){
        double sum = this.days * this.price;
        return sum;
    }

}
