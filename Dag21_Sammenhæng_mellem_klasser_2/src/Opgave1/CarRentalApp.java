package Opgave1;

public class CarRentalApp {
    public static void main(String[] args) {

        //Opretter biler.
        Car car1 = new Car("12345",1992);
        car1.setDayPrice(230.0);
        Car car2 = new Car("AP 81 327",2014 );
        car2.setDayPrice(320.0);
        Car car3 = new Car("KK 22 333",2013 );
        car3.setDayPrice(450.0);
        Car car4 = new Car("11 22 33 44",2020 );
        car4.setDayPrice(732.5);
        Car car5 = new Car("98765",1920 );
        car5.setDayPrice(1782.99);

        //Opretter rental.
        Rental ren1 = new Rental(20,5 ,"2021-11-20");
        Rental ren2 = new Rental(21,20 ,"2021-12-3");

        //tilføger bilerne til udlejningen//
        ren1.addCarToRental(car1);
        ren1.addCarToRental(car2);
        ren1.addCarToRental(car3);
        ren1.addCarToRental(car4);

        ren2.addCarToRental(car3);
        ren2.addCarToRental(car4);
        ren2.addCarToRental(car5);

        System.out.println("samlet pris for rental 1, med bil 1 til 4 i 5 dage: " + ren1.getprice() + "Kr");
        System.out.println("samlet pris for rental 2, med bil 3 til 5 i 20 dage: " + ren2.getprice() + "Kr");

        ren1.removeCarFromRental(car3);
        System.out.println("samlet pris for rental 1, med bil 1 til 4 (Uden bil 3) i 5 dage: " + ren1.getprice() + "Kr");

        System.out.println("Størst antal dage bil 3 er udlejet: " + car3.mostDaysCarRent());
        System.out.println("Størst antal dage bil 4 er udlejet: " + car4.mostDaysCarRent());
        System.out.println("Størst antal dage bil 2 er udlejet: " + car2.mostDaysCarRent());



    }
}
