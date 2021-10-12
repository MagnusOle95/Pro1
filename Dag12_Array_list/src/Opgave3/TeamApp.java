package Opgave3;

public class TeamApp {
    public static void main(String[] args) {

        //Opgave 3 b.5 Tester metoderne i opgave b//
        Player p1 = new Player("Kim",23);
        System.out.println("\nSpiller 1´s navn: " + p1.getName() + "\nAlder: " + p1.getAge());
        p1.setscore(10);
        System.out.println("score: " + p1.getscore());
        p1.addScore(5);
        System.out.println("tilføget 5 points til score, score = " + p1.getscore());

        System.out.println(); //Mellemrum//


        Player p2 = new Player("Lars",21 );
        p2.addScore(45);
        Player p3 = new Player("Benny",45 );
        p3.addScore(8);
        Player p4 = new Player("Magnus",34);
        p4.addScore(22);

        Team t1 = new Team("Slagelse");
        t1.AddPlayer(p1);
        t1.AddPlayer(p2);
        t1.AddPlayer(p3);
        t1.AddPlayer(p4);
        t1.printPlayers();
        System.out.println("teamets gennemsnitsalder: " + t1.CalcAvageAge());
        System.out.println("Teamets samlede score: " + t1.calcTotalScore());

        System.out.println("Samlet score for spillere der er over 30: " + t1.calcOldPlayerScore(30));
        System.out.println("Højeste score en spiller på holdet har lavet: " + t1.maxScore());
        System.out.println("Navnet på den bedste spiller: " + t1.bestPlayer());


    }
}
