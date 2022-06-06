/*
 * 
 */
package Rekursion;

/**
 * @author mad
 */
public class Hanoi {

	private static int antal;

	public static void flyt(int n, int fra, int til){

		if (n==1) {
			System.out.println("Flyt fra " +fra +" til " + til);
			antal++;
		}

		else {
			int temp = 6 - fra - til;
			flyt(n-1,fra,temp);
			antal++;
			System.out.println("Flyt fra " + fra +" til " + til);
			flyt(n-1,temp,til);
		}
	}

	public static void main(String[] args) {
			flyt(10,1,3);
		System.out.println(antal);
		
	}
}
