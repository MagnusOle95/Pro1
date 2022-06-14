package Patterns.singleton.PersonAdministratorKlasse_Singleton;

public class AndvendPersonAdministrator {

    public static void main(String[] args) {

        //Laver personer
        Person p1 = new Person("Jens",26);
        Person p2 = new Person("Jeppe",23);
        Person p3 = new Person("Esben",22);
        Person p4 = new Person("Magnus",27);

        //Tester add metoder
        PersonAdministrator.getInstance().addPerson(p1);
        PersonAdministrator.getInstance().addPerson(p2);
        PersonAdministrator.getInstance().addPerson(p3);
        PersonAdministrator.getInstance().addPerson(p4);

        //Tjekker liste
        System.out.println(PersonAdministrator.getInstance().getpersoner());

        //Fjerner personer
        PersonAdministrator.getInstance().removePerson(p3);
        PersonAdministrator.getInstance().removePerson(p2);

        //tester liste
        System.out.println(PersonAdministrator.getInstance().getpersoner());


    }


}
