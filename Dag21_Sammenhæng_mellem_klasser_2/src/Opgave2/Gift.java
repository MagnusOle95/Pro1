package Opgave2;

public class Gift {

    //Attributer//
    private String description;
    private double price;

    //Link attribut//
    private Person giver;

    //Construcktor//
    public Gift(String description,Person person){
        this.description = description;
        this.giver = person;
    }


    //Metoder//
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    //Get og set metoder til link attribut//

    public void chancePerson(Person person){
        this.giver = person;
    }

    public Person getGiver(){
        return giver;
    }

    public void removeGiver(){
        this.giver = null;
    }

}
