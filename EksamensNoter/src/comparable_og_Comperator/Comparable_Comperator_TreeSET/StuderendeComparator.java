package comparable_og_Comperator.Comparable_Comperator_TreeSET;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {


    @Override
    public int compare(Studerende o1,Studerende o2) {
        return o1.getNavn().toLowerCase().compareTo(o2.getNavn().toLowerCase());
    }
}
