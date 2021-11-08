package Opgave2;

public class App {
    public static void main(String[] args) {

        //Opretter personen der modtager gaver//
        Person p0 = new Person("Mig", 26);

        //Opretter personer der giver gaver//
        Person p1 = new Person("Bedstemor Janne", 83);
        Person p2 = new Person("Far Kean", 43);
        Person p3 = new Person("Bror Flemming", 22);
        Person p4 = new Person("Onkel Henning", 65);
        Person p5 = new Person("Dumme Karl", 38);

        //Opretter gaver og sætter prisen//
        Gift g1 = new Gift("Lego 2000", p1);
        g1.setPrice(200);

        Gift g2 = new Gift("Leg godt 3", p2);
        g2.setPrice(432.8);

        Gift g3 = new Gift("Tøj mand", p3);
        g3.setPrice(999.99);

        Gift g4 = new Gift("ikke for børn", p4);
        g4.setPrice(127.2);

        Gift g5 = new Gift("Dametøj", p5);
        g5.setPrice(54.2);


        //Tilføger gaver til modtager person p0//
        p0.addGift(g1);
        p0.addGift(g2);
        p0.addGift(g3);
        p0.addGift(g4);
        p0.addGift(g5);

        //Tester metode der udregner, gavers samlede pris.
        System.out.println("Samlede pris på gaver, for p0: " + p0.calPriceOfAllGifts());

        //Tester metoden er finder alle navne på personer der har givet, en gave//
        System.out.println("Udskriver navne på personerne der har givet en gave til p0: " + p0.getNameFromGiftList());



    }
}
