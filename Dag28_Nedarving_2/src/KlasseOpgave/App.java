package KlasseOpgave;

public class App {

    public static void main(String[] args) {

        Person p = new Person("Jens",1992);
        Student s = new Student("Helle", 1998,"Fransk");
        Instructor i = new Instructor("Flemming",1980,198);

        System.out.println(p);
        System.out.println();
        System.out.println(s);
        System.out.println();
        System.out.println(i);
    }

}
