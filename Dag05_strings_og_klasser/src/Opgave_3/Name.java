package Opgave_3;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;


    public Name(String firstName,String middleName,String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    /////////////////////////////////////////////////////////////////////////////////////


    //Sætter de 3 attributer//

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /////////////////////////////////////////////////////////////////////////////////////


    //Forespørge, modtage - Get de 3 atributer//

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }
    /////////////////////////////////////////////////////////////////////////////////////


    //Metode der retunere Initialer for personen//
    public String getInit(){
        return firstName.substring(0,1) + middleName.substring(0,1 ) + lastName.substring(0, 1);
    }
    /////////////////////////////////////////////////////////////////////////////////////


    //udvikler get username, der retunere et username til den bestemte person//
    public String getUserName(){
    return firstName.toUpperCase().substring(0,2) +
            middleName.length() +
            lastName.toLowerCase().substring(lastName.length() - 2);
    }


    //Udprint af informationer//
    public void printInformation(){
        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Init: " + getInit());
        System.out.println("Username: " + getUserName() + "\n");
    }

    }



