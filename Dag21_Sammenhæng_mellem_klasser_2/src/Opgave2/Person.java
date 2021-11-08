package Opgave2;

import java.util.ArrayList;

public class Person {

    //Attributer//
    private String name;
    private int age;

    //Link attribut//
    private ArrayList<Gift> gifts = new ArrayList<>();

    //Constructor//
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Metoder//
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "" + name + " " + age;
    }

    public void addGift(Gift gift){
        if (!gifts.contains(gift)){
            gifts.add(gift);
        }
    }

    public void removeGift(Gift gift){
        if (gifts.contains(gift)){
            gifts.remove(gift);
        }
    }

    public ArrayList<Gift> getGifts(){
        return new ArrayList<>(gifts);
    }

    public double calPriceOfAllGifts(){
        double sum = 0;
        for (Gift gift : gifts){
            sum += gift.getPrice();
        }
        return sum;
    }

    public ArrayList<Person> getNameFromGiftList(){
        ArrayList<Person> list = new ArrayList<>();

        for (int i = 0; i < gifts.size(); i++){
            list.add(gifts.get(i).getGiver());
        }
        return list;
    }


}
