package Patterns.singleton.PersonAdministratorKlasse_Singleton;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {

    //Attributer
    private static PersonAdministrator instance;
    private Set<Person> personer;

    //Construktor
    private PersonAdministrator(){
    personer = new HashSet<>();
    }

    //Metode get instance / create instance.
    public static PersonAdministrator getInstance(){
        if (instance == null){
            instance = new PersonAdministrator();
        }
        return instance;
    }

    //metoder
    public void addPerson(Person person){
        personer.add(person);
    }

    public Set<Person> getpersoner(){
        return new HashSet<>(personer);
    }

    public void removePerson(Person person){
            personer.remove(person);
    }





}
