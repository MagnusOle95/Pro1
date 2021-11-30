package Opgave1_bankkonto.Service;

import Opgave1_bankkonto.Model.Konto;
import Opgave1_bankkonto.Model.KontoType;
import Opgave1_bankkonto.Storage.Storage;

public class Service {

	public static KontoType createKontoType(String navn, String beskrivelse) {

		KontoType kontoType = new KontoType(navn, beskrivelse);
		Storage.addKontoType(kontoType);
		return kontoType;
	}

	public static Konto createKonto(KontoType kontoType) {
		Konto konto = null;

		konto = new Konto(kontoType);

		return konto;
	}

	public static void closeKonto(Konto konto){
		konto.closeKonto();
	}


	public static void haevEllerIndsaetBeloeb(Konto konto, int beloeb) {
		try {
			konto.haevEllerIndsaetBeloeb(beloeb);
		} catch (RuntimeException exception) {
			System.out.println(exception.getMessage());
		}
	}



}
