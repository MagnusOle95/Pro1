package genere_itit_username_skudår_alder;

/**
 * Write a description of class Person here.
 *
 * @author (Margrethe Dybdahl)
 * @version (16 / 09 / 2020)
 */
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int dayOfBirth; // 1..31
    private int monthOfBirth; // 1..12
    private int yearOfBirth; // 1900..2010

    /**
     * Constructor for objects of class Person
     */

    public Person(String firstName, String middleName, String lastName,
                  int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    //Constructor for objets of class person without a middlename//
    public Person(String firstName,String lastName,
                  int dayOfBirth,int monthOfBirth,int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void printPerson() {
        if (this.middleName == null){
            System.out.println(firstName + " " + lastName + " "
                    + dayOfBirth + "." + monthOfBirth + "." +yearOfBirth);
        } else {
            System.out.println(firstName + " " + middleName + " " + lastName + " "
                    + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        }
    }


    public String getInit() {
        if (this.middleName == null){
            return "" + firstName.charAt(0) + firstName.charAt(1) + lastName.charAt(0);
        } else {
            return "" + firstName.charAt(0) + middleName.charAt(0)
                    + lastName.charAt(0);
        }
    }


    public String getUserName() {
        if (this.middleName == null) {
            String tekst1 = firstName.substring(0, 2).toUpperCase();
            int tekst2 = firstName.length() - lastName.length();
            String tekst3 = lastName.substring(lastName.length() -2 );
            return tekst1 + tekst2 + tekst3;
        } else {
            String tekst1 = firstName.substring(0, 2).toUpperCase();
            String tekst2 = middleName.length() + "";
            String tekst3 = lastName.substring(lastName.length() - 2);
            return tekst1 + tekst2 + tekst3;
        }


    }
    public int age(int dayToDay, int monthToDay, int yearToDay) {
        int age = (yearToDay - this.yearOfBirth); // TODO make the code work

        if (monthToDay < this.monthOfBirth){
            age--;
        }else if (monthToDay == this.monthOfBirth && dayToDay < this.dayOfBirth){
            age--;
        }
        return age;
    }


    /**
     * Returns whether year is a leapyear
     *
     * @param year
     * @return
     */
    public boolean leapYear(int year) {
        boolean leapYear = false; // TODO make the code work

        if ((year % 4) == 0) {
            leapYear = true;
        }
        if ((year % 100) == 0){
            leapYear = false;
        }
        if ((year % 400) == 0){
            leapYear = true;
        }
        return leapYear;
    }
}
