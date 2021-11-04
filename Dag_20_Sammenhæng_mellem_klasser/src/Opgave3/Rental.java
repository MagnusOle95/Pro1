package Opgave3;

import java.util.ArrayList;

public class Rental {

    private int numbers;
    private int days;
    private String date;

    public final ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getCars(){
        return new ArrayList<>(cars);
    }

    public Rental(int numbers, int days, String date){
        this.numbers = numbers;
        this.days = days;
        this.date = date;
    }

    public void addCarToRental(Car car){
        cars.add(car);
    }

    public void removeCarFromRental(Car car){
        if (cars.contains(car)){
            cars.remove(car);
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
