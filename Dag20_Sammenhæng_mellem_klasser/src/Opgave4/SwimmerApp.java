package Opgave4;

import java.util.ArrayList;

public class SwimmerApp {
    
    public static void main(String[] args) {
        TrainingPlan p1 = new TrainingPlan('A',16 ,10 );
        TrainingPlan p2 = new TrainingPlan('B',10,6);

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer s1 = p1.createSwimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer s2 = p1.createSwimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer s3 = p2.createSwimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);

        //Udskriver svømmere i plan 1;
        for (Swimmer s : p1.getswimmers()) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        for (Swimmer s : p1.getswimmers()){
            System.out.print(s.getName() + " ");
            System.out.print(s.getClub() + " ");
            System.out.println(s.getYearGroup());
        }

        //Udksirver svømmere i plan 2//
        for (Swimmer s : p2.getswimmers()) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        for (Swimmer s : p2.getswimmers()){
            System.out.print(s.getName() + " ");
            System.out.print(s.getClub() + " ");
            System.out.println(s.getYearGroup());
        }


    }
}
