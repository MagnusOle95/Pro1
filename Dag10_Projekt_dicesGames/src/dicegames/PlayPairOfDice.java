package dicegames;

import java.util.Scanner;

public class PlayPairOfDice {
    private Scanner scan;
    private PairOfDices dices;

    public PlayPairOfDice(){
        scan = new Scanner(System.in);
        dices = new PairOfDices();
    }

    private void WelcometotheGame () {
        System.out.println("Velkommen til spillet");
    }

    public void gameover() {
        System.out.println("Tak for spillet" +
                "\n antal 6 slået " + dices.getsixes() +
                "\n antal 5 slået " + dices.getFives() +
                "\n antal 4 slået " + dices.getFours() +
                "\n antal 3 slået " + dices.getThrees() +
                "\n antal 2 slået " + dices.getTwos() +
                "\n antal 1 slået " + dices.getOnes() +
                "\n antal par slået " + dices.getPairs() +
                "\n største kast slået " + dices.getBiggestRole() + "\n");
    }

    private void takeTurn(){
        dices.roleBothDices();
        System.out.println("Du har kastet " + dices.sumOfDices());
    }

    public void startGame(){
        WelcometotheGame();

        boolean finished = false;

        while (!finished){
            System.out.println("Vil du kaste dine 2 terninger? Angiv ja eller nej:");
            String fortSæt = scan.next();
            if (fortSæt.equalsIgnoreCase("Nej")){
                finished = true;
            }else{
                takeTurn();
            }
        }
        gameover();
        dices.resetPairOFDice();
        startGame();
    }
}
