package Opgave3_Comparable_TreeSET;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        Studerende s1 = new Studerende(1,"Magnus");
        s1.addKarater(12);
        s1.addKarater(7);
        s1.addKarater(10);

        Studerende s2 = new Studerende(4,"Kim" );
        s2.addKarater(7);
        s2.addKarater(12);
        s2.addKarater(4);

        Studerende s3 = new Studerende(3,"Mathias");
        s3.addKarater(7);
        s3.addKarater(7);
        s3.addKarater(7);

        Studerende s4 = new Studerende(2,"Mikkel");
        s4.addKarater(4);
        s4.addKarater(4);
        s4.addKarater(2);

        List<Studerende> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println("før sortering: " + list);

        Collections.sort(list);

        System.out.println("Efter sort: " + list);


        TreeSet<Studerende> set = new TreeSet<>(new StuderendeComparator());
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);



    }


}
