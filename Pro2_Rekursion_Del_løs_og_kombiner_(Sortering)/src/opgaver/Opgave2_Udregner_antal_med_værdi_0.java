package opgaver;

import java.util.ArrayList;

public class Opgave2_Udregner_antal_med_værdi_0 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(0);
        list.add(1);
        list.add(8);
        list.add(0);
        list.add(11);
        list.add(3);
        list.add(0);

        System.out.println(antalO(list));

    }

    public static int antalO(ArrayList<Integer> list) {
        return antal0(list, 0, list.size() - 1);
    }

    private static int antal0(ArrayList<Integer> list, int l, int h) {
        int antal0 = 0;

        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }

        } else {
            int m = (l + h) / 2;
            antal0 = antal0 + antal0(list, l, m);
            antal0 = antal0 + antal0(list, m + 1, h);
        }
        return antal0;

    }
}



