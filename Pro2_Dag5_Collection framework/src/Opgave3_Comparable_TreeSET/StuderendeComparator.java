package Opgave3_Comparable_TreeSET;

import java.util.Comparator;
import java.util.Locale;

public class StuderendeComparator implements Comparator<Studerende> {


    @Override
    public int compare(Studerende o1,Studerende o2) {
        return o1.getNavn().toLowerCase().compareTo(o2.getNavn().toLowerCase());
    }
}
