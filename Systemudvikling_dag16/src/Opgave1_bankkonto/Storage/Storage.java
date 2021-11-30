package Opgave1_bankkonto.Storage;

import java.util.ArrayList;

import Opgave1_bankkonto.Model.KontoType;

public class Storage {

	private static ArrayList<KontoType> kontoTyper = new ArrayList<KontoType>();

	public static void addKontoType(KontoType kontoType) {
		if (!kontoTyper.contains(kontoType)) {
			kontoTyper.add(kontoType);
		}
	}

}
