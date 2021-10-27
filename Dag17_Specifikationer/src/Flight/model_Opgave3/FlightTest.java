package Flight.model_Opgave3;

import java.time.LocalDateTime;

public class FlightTest {

    public static void main(String[] args) {

        //Opretter fly og tilføjer passagere//
        Flight flight = new Flight("AY025", "Seoul");
        flight.createPassenger("Arnold", 31);
        flight.createPassenger("Bruce", 59);
        flight.createPassenger("Dolph", 24);
        flight.createPassenger("Linda", 59);
        flight.createPassenger("Jennifer", 65);

        //Kalder fly nummer og destination på flyet//
        System.out.println("Fly1's nummer: " + flight.getFlightNumber());
        System.out.println("Fly1's destination: " + flight.getDestination());

        //Sætter afgang og ankomst tid//
        flight.setDepartDate(LocalDateTime.of(2021, 10, 29, 13, 30));
        flight.setArrivalDate(LocalDateTime.of(2021, 10, 30, 18, 42));

        //Tester fejlbesked ved forkert ankomst//
        flight.setArrivalDate(LocalDateTime.of(2021, 10, 29, 18, 42));

        //Spørger om afgang og ankomst//
        System.out.println(flight.getDepartDate());
        System.out.println(flight.getArrivalDate());

        //Printer passager liste//
        System.out.println(flight.printPassengers());

        //Printer tom liste i nyt fly//
        Flight flight2 = new Flight("z233","Yocos" );
        System.out.println(flight2.printPassengers());

        //Tester remove passenger//
        flight.removePassenger("dOLph");
        System.out.println(flight.printPassengers());

        //Tester hvor lang tid flyveturen tager//
        System.out.println("Flyve tiden er " + flight.flightDurationInHours() + " timer");

        //Tester metoden der udregner gennemsnitsmetoden på passagere på flyet//
        System.out.println("Gennemsnitsalderen på passagere i flyet er " + flight.averageAgeOfPassenger() + " år");

        //Tester om det er et midnatsfly//
        System.out.println("Flyver flyet over midnat " + flight.midnightFlight());


    }
}


