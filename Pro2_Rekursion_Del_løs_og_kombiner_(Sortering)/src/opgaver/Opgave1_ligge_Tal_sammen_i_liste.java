package opgaver;

import java.util.ArrayList;

public class Opgave1_ligge_Tal_sammen_i_liste {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(3);
        list.add(6);

        System.out.println(sum(list));

    }


    public static int sum(ArrayList<Integer> list){
        return sum(list,0 ,list.size() - 1);
    }

    private static int sum(ArrayList<Integer> list, int l, int h){
        int total = 0;
        if (l == h){
            return list.get(l);
        }else{
            int m = (l + h) / 2;
            total = total + sum(list,l ,m);
            total = total + sum(list,m + 1 ,h);
        }
        return total;
    }

}
