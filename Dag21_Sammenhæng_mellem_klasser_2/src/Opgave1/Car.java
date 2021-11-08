package Opgave1;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;

public class Car {

    private String license;
    private double pricePerDay;
    private int purcaseYear;

    private final ArrayList<Rental> rentals = new ArrayList<>();

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

    public void addRentalToCar(Rental rental){
        if (!rentals.contains(rental)){
            rentals.add(rental);
            rental.addCarToRental(this);
        }
    }

    public void removeRentalFromCar(Rental rental){
        if (rentals.contains(rental)){
            rentals.remove(rental);
            rental.removeCarFromRental(this);
        }
    }

    public int mostDaysCarRent(){
        int sum = 0;
        for (Rental rental : rentals){
            if (sum < rental.getDays()){
                sum = rental.getDays();
            }
        }
        return sum;
    }

}
