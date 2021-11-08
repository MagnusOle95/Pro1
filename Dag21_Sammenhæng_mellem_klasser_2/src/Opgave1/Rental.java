package Opgave1;

import java.util.ArrayList;

public class Rental {

    private int numbers;
    private int days;
    private String date;

    private final ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getCars(){
        return new ArrayList<>(cars);
    }

    public Rental(int numbers, int days, String date){
        this.numbers = numbers;
        this.days = days;
        this.date = date;
    }

    public void addCarToRental(Car car){
        if (!cars.contains(car)){
            cars.add(car);
            car.addRentalToCar(this);
        }
    }

    public void removeCarFromRental(Car car){
        if (cars.contains(car)){
            cars.remove(car);
            car.removeRentalFromCar(this);
        }
    }

    public double getprice(){
        double sum = 0;
        for (Car cars : cars){
            sum += cars.getDayPrice() * this.days;
        }
        return sum;
    }

    public void setDays(int days){
        this.days = days;
    }

    public int getDays(){
        return days;
    }






}
