package Opgave2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestRentalApp {
    public static void main(String[] args) {
        LocalDate start1 = LocalDate.of(2021, 11, 1);
        Rental leje1 = new Rental(3512, 20, 300, start1);
        System.out.println(leje1.getTotalPrice());

        LocalDate start2 = LocalDate.now().plusMonths(10);
        Rental leje2 = new Rental(3513, 20, 400, start2);
        System.out.println(leje2.getTotalPrice());

        System.out.println("Udlejning 1 totale pris: " + leje1.getTotalPrice() + "\nSlutdato: " + leje1.getEndDate() + "\nDagen før startdatoen: " + leje1.getStartDate().minusDays(1));
        System.out.println("\nUdlejning 2 totale pris: " + leje2.getTotalPrice() + "\nSlutdato: " + leje2.getEndDate() + "\nDagen før startdatoen: " + leje2.getStartDate().minusDays(1));

        System.out.println();

        Period period = leje1.getStartDate().until(leje2.getStartDate());
        long years2 = period.getYears();
        long month2 = period.getMonths();
        long days2 = period.getDays();

        long days = ChronoUnit.DAYS.between(start1, start2);

        System.out.println("tid mellem de 2 startdatoer\n" +
                "År: " + years2 + "\nMåneder: " + month2 + "\nDays: " + days2);

        System.out.println();

        System.out.println("Antal dage mellem de 2 udlejninger: " + days);
    }
}
