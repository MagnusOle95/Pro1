package Opgave_3;

public class NameApp {
    public static void main(String[] args) {
        Name person1 = new Name("Magnus","Sandfeld" ,"larsen");
        person1.printInformation();

        person1.setFirstName("Ken");
        person1.setMiddleName("humlebæk");
        person1.setLastName("larsen");
        person1.printInformation();

    }
}
