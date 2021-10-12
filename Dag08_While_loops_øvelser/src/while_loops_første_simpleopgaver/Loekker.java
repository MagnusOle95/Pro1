package while_loops_første_simpleopgaver;

public class Loekker {
	public void udskriv1_10() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

	}

	public void udskriv1_10_iteration() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public int summer() {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;

		}
		return sum;

	}

	public int summer(int n) {
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		return sum;

	}

	public int multiplum(int a, int b) {
		int resultat = 0;
		int i = 0;
		while (i < a) {
			resultat = resultat + b;
			i++;
		}
		return resultat;

	}

	public int summerEven() {
		//Opgave 1.a
		int sum = 0;
		int i = 2;

		while (i <= 100) {
			sum = i + sum;
			i = i + 2;
		}
		return sum;
	}

	public int summerSquare() {
		// TODO Opgave 1.b
		int sum = 0;
		int i = 1;

		while (i * i <= 100) {
			sum = sum + i * i;
			i++;
		}
		return sum;
	}


	public void allPowers() {
		// TODO Opgave 3.a

		//Startværdien af 2^0 og den samlede sum.
		int summenAf2Talspotensen = 1;
		int potens = 0;

		//While loopen der, udregner alle 2talspotenser ud op til 2^20
		while (potens <= 20) {
			summenAf2Talspotensen = summenAf2Talspotensen * 2;
			System.out.println(summenAf2Talspotensen);
			potens++;
		}
	}


	public int sumOdd(int a, int b) {
		// TODO Opgave 3.b

		int sum = 0;

		while (a <= b) {

			if (a % 2 == 0) {
			} else {
				sum = sum + a;
			}
			a++;
		}
		return sum;
	}

	public int sumOfOddDigits(int number) {
		// TODO Opgave 3.c

		int sum = 0;
		String stringNumber = String.valueOf(number);
		int talNummer = 0;

		while (talNummer <= stringNumber.length()) {

			if (2 == 0) ;
		}
		return sum;
	}
}

