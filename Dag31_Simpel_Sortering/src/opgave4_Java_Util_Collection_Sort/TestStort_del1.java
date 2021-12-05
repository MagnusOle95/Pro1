package opgave4_Java_Util_Collection_Sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestStort_del1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Bent");
        list.add("Thomas");
        list.add("Karsten");
        list.add("Dan");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //Den bruger en af de sorterings alkarytmer vi har lært, sandsynligvis insertion sort.
        //Den virker dog kun med arraylister.

    }



}
