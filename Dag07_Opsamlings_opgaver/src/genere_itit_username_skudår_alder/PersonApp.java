package genere_itit_username_skudår_alder;

public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person("Bent", "Janus", "Christensen", 27, 12, 1995);
        p.printPerson();
        System.out.println("Initialer: " + p.getInit());
        System.out.println("Username: " + p.getUserName());

        System.out.println("Age: " + p.age(27, 11, 2021)); // p's age today
        // int year = 2021;
        System.out.println("Er " + 1600 + " skudår: " + p.leapYear(1600));

        Person p2 = new Person("Børge", "Andersen", 23, 4, 1920);
        p2.printPerson();
        System.out.println("Initialer: " + p2.getInit());
        System.out.println("Username: " + p2.getUserName());

    }
}
