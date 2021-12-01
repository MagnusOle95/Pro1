package soegningelevopgaver_Opg1_Til_4;

public class SoegningApp {

	 
	
	public static void main(String[] args) {
		Soegning s = new Soegning();
		
		// Kode til afprøvning af opgave 1
		int[] talArray = {2,4,8,2};
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
		talArray[2] = 15;
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

		// Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7

		//Opgave 2
		int[] talArrayOpg2 = {7, 56, 34, 3, 7, 14, 13, 4};
		System.out.println("det første tal mellem 10 og 15 i arrayet: " + s.findFirsttal(talArrayOpg2,10 ,15 ));

		//Opgave 3
		int[] talArray1Opg3 = {7, 9, 13, 7, 9, 13};
		int[] talArray2Opg3 = {7, 9, 13, 13, 9, 7};

		System.out.println("2 ens tal, i array1: " + s.toEnsTal(talArray1Opg3));
		System.out.println("2 ens tal, i array2: " + s.toEnsTal(talArray2Opg3));


	}


}
