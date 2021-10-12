package dicegames;

import java.security.PrivateKey;

/**
 * This class models one pair of dices.
 *
 */
public class PairOfDices {
    /**
     * The first die in the pair.
     */
	private Die die1;
	/**
	 * The second die in the pair.
	 */
	private Die die2;


	//Attributer//
	private int rolls;
	private int sixes;
	private int fives;
	private int fours;
	private int threes;
	private int twos;
	private int ones;
	private int pairs;
	private int biggestRole;

	/**
	 * Constructor for objects of class PairOfDices
	 */
	// TODO: put the constructor here!

	public PairOfDices() {
		die1 = new Die();
		die2 = new Die();
		rolls = 0;
		sixes = 0;
		fives = 0;
		fours = 0;
		threes = 0;
		twos = 0;
		ones = 0;
		pairs = 0;
		biggestRole = 0;
	}

	public PairOfDices(int antalsider){
		die1 = new Die(antalsider);
		die2 = new Die(antalsider);
		rolls = 0;
		sixes = 0;
		fives = 0;
		fours = 0;
		threes = 0;
		twos = 0;
		ones = 0;
		pairs = 0;
		biggestRole = 0;
	}

	public void roleBothDices(){
		die1.roll();
		die2.roll();
		rolls++;

		if (die1.getFaceValue() + die2.getFaceValue() > biggestRole){
			biggestRole = die1.getFaceValue() + die2.getFaceValue();
		}

		if (die1.getFaceValue() == 6 && die2.getFaceValue() == 6){
			sixes += 2;
			pairs++;
		}else if (die1.getFaceValue() == 6 || die2.getFaceValue() == 6){
			sixes++;
		}

		if (die1.getFaceValue() == 5 && die2.getFaceValue() == 5){
			fives += 2;
			pairs++;
		}else if (die1.getFaceValue() == 5 || die2.getFaceValue() == 5){
			fives++;
		}

		if (die1.getFaceValue() == 4 && die2.getFaceValue() == 4){
			fours += 2;
			pairs++;
		}else if (die1.getFaceValue() == 4 || die2.getFaceValue() == 4){
			fours++;
		}

		if (die1.getFaceValue() == 3 && die2.getFaceValue() == 3){
			threes += 2;
			pairs++;
		}else if (die1.getFaceValue() == 3 || die2.getFaceValue() == 3){
			threes++;
		}

		if (die1.getFaceValue() == 2 && die2.getFaceValue() == 2){
			twos += 2;
			pairs++;
		}else if (die1.getFaceValue() == 2 || die2.getFaceValue() == 2){
			twos++;
		}

		if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1){
			ones += 2;
			pairs++;
		}else if (die1.getFaceValue() == 1 || die2.getFaceValue() == 1){
			ones++;
		}
	}


	public int sumOfDices(){
		return die1.getFaceValue() + die2.getFaceValue();
	}

	public int getsixes(){
		return sixes;
	}

	public int getFives(){
		return fives;
	}

	public int getFours(){
		return fours;
	}

	public int getThrees(){
		return threes;
	}

	public int getTwos(){
		return twos;
	}

	public int getOnes(){
		return ones;
	}

	public int getPairs(){
		return pairs;
	}

	public void resetPairOFDice(){
		rolls = 0;
		sixes = 0;
		fives = 0;
		fours = 0;
		threes = 0;
		twos = 0;
		ones = 0;
		pairs = 0;
		biggestRole = 0;
	}

	public int getBiggestRole(){
		return biggestRole;
	}
}
