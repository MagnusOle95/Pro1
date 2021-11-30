package Opgave1_bankkonto.Model;

import Opgave1_bankkonto.Service.Service;


public class TilstandeTest {

	public static void main(String[] args) {

		KontoType kontotype = Service.createKontoType("Ungdomskonto",
				"En kontotype til unge under 25, som for at beskytte du unge ikke tillader at der haeves paa en konto med saldo under 0");

		Konto k1 = Service.createKonto(kontotype);

		Service.haevEllerIndsaetBeloeb(k1, 100);

		// tilfoej flere transaktioner og se hvad der sker

		System.out.println(k1);

		Service.haevEllerIndsaetBeloeb(k1,800);
		Service.haevEllerIndsaetBeloeb(k1,-200);
		System.out.println(k1);

		Konto k2 = Service.createKonto(kontotype);
		Service.haevEllerIndsaetBeloeb(k2,87000);
		System.out.println(k2);

		Service.closeKonto(k2);
		Service.haevEllerIndsaetBeloeb(k2,-7000 );
		System.out.println(k2.getTilstand());
		System.out.println(k2);




	}
}
