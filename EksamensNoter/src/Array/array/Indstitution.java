package Array.array;

public class Indstitution {

    //Attributer//
    private String name;
    private String address;
    private Child[] children;
    private int arrayUsed;
    private static final int MAX_NUMBER_OF_CHILDREN = 30;


    //Construktor//
    public Indstitution(String navn,String adresse){
        this.name = navn;
        this.address = adresse;
        this.arrayUsed = 0;
        this.children = new Child[MAX_NUMBER_OF_CHILDREN];

    }

    //Set attributes//
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    //Get attributes//
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    //sign up children//
    public void addChild(Child child){
        children[arrayUsed] = child;
        arrayUsed++;
    }

    //return the averageAge of the kids//
    public int averageAge(){
        int sum = 0;
        for (int i = 0; i < arrayUsed; i++){
            sum = children[i].getAge() + sum;
        }
        sum = sum / arrayUsed;
        return sum;
    }

    //Return number of boys and Girls in the institution//
    public int numberOfGirls(){
        int numberOfGirls = 0;
        for (int i = 0; i < arrayUsed; i++){
            if (!children[i].isBoy()){
                numberOfGirls++;
            }
        }
        return numberOfGirls;
    }

    //her kumme man nøjes med at, at tage metoden number of girls og minus med antallet af børn for at finde antallet af drenge//
    public int numberOfBoys(){
        int sum = 0;
        for (int i = 0; i < arrayUsed; i++){
            if (children[i].isBoy()){
                sum++;
            }
        }
        return sum;
    }


}
