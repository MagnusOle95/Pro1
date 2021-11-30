package storage;

import model.Bane;
import model.Medlem;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Bane> baner = new ArrayList<>();
    private static final ArrayList<Medlem> medlemmer = new ArrayList<>();

    public static ArrayList<Bane> getBaner() {
        return new ArrayList<>(baner);
    }

    public static ArrayList<Medlem> getMedlemmer() {
        return new ArrayList<>(medlemmer);
    }

    public static void storeBane(Bane bane) {
        baner.add(bane);
    }

    public static void storeMedlem(Medlem medlem) {
        medlemmer.add(medlem);
    }
}
