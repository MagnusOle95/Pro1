package Pig;

import java.util.Scanner;

public class PlayPigAI {
    private Die die;
    private Scanner scan;
    private boolean Player1;
    private int player1Score;
    private int Player2Score;
    private int Playto;
    private boolean isFirstRoll;
    private int dieSum;
    private boolean finish;
    private String spillerNavn;
    private double amoundOfRolls;
    private double amoundOfPlayerChance;
    private int computerAi;
    private boolean aiOn;

    PlayPigAI() {
        die = new Die();
        scan = new Scanner(System.in);
        Player1 = true;
        player1Score = 0;
        Player2Score = 0;
        isFirstRoll = true;
        dieSum = 0;
        finish = false;
        spillerNavn = "Spiller 1";
        amoundOfRolls = 0;
        amoundOfPlayerChance = 1;
        computerAi = (int)Math.random();
        aiOn = false;
    }


    public void Welcometogame() {
        System.out.println("Velkommen til spillet Pig");
    }

    public void gameOver() {
        if (player1Score > Player2Score) {
            System.out.println("\nTillykke player 1, du har vundet");
        } else {
            System.out.println("\nTillykke player 2, du har vundet");
        }
        System.out.println("\nStatestik/Gennemsnit\nSlag pr runde: " + amoundOfRolls / amoundOfPlayerChance);
        scan.close();
    }

    public void takeTurn() {
        die.roll();
        System.out.println(die.getFaceValue());
        if (die.getFaceValue() == 1) {
            System.out.println("Du slog 1, slut");
            changeplayer();
        } else {
            dieSum += die.getFaceValue();
        }
        amoundOfRolls++;
    }

    public void changeplayer() {
        if (player1Score >= Playto || Player2Score >= Playto) {
            finish = true;
        } else {
            if (Player1 == true) {
                Player1 = false;
                spillerNavn = "Spiller 2";
            } else {
                Player1 = true;
                spillerNavn = "Spiller 1";
            }
            dieSum = 0;
            amoundOfPlayerChance++;
        }
    }

        public void startgame () {
            Welcometogame();
            if (isFirstRoll) {
                System.out.println("Hvad vil i spille til");
                Playto = scan.nextInt();
            }

            if (isFirstRoll) {
                System.out.println("\nVil du spille med en AI som spiller 2");
                String svar = scan.next();
                if (svar.equalsIgnoreCase("Ja")){
                    aiOn = true;
                }
            }
            isFirstRoll = false;

            while (!finish) {
                System.out.println("\nVil du kaste dine terninger " + spillerNavn);
                String fortsæt = scan.next();
                if (fortsæt.equalsIgnoreCase("Nej") || die.getFaceValue() == 0) {
                    if (Player1 == true) {
                        player1Score += dieSum;
                    } else if (Player1 == false) {
                        Player2Score += dieSum;
                    }
                    System.out.println("Player 1: " + player1Score);
                    System.out.println("Player 2 AI: " + Player2Score);
                    changeplayer();
                } else {
                    takeTurn();
                }
            }
            gameOver();
        }
    }

