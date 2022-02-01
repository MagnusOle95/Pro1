package Opgaver1;

import javax.naming.Name;
import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public class Opgave1 {

    //Opgave 1
    public static int ligetal(ArrayList<Integer> tal) {
        int result;

        if (tal.size() == 0) {
            result = 0;
        } else if (tal.get(0) % 2 != 0) {
            tal.remove(0);
            result = ligetal(tal);
        } else {
            tal.remove(0);
            result = 1 + ligetal(tal);
        }
        return result;
    }


    //Opgave 1.2
    public static int ligetal2(ArrayList<Integer> list) {
        return ligetal2(list, 0);
    }

    private static int ligetal2(ArrayList<Integer> list, int index) {
        int resultat;

        if (index == list.size()) {
            resultat = 0;
        } else if (list.get(index) % 2 != 0) {
            resultat = ligetal2(list, index + 1);
        } else {
            resultat = 1 + ligetal2(list, index + 1);
        }
        return resultat;
    }


    //Opgave 2
    public static boolean palindrom(String navn) {
        return palindrom(navn, 0, navn.length() - 1);
    }

    private static boolean palindrom(String navn, int indexLeft, int indexRight) {
        boolean palindrom;

        if (indexLeft >= indexRight) {
            palindrom = true;
        } else if (navn.charAt(indexLeft) == navn.charAt(indexRight)) {
            palindrom = palindrom(navn, indexLeft + 1, indexRight - 1);
        } else {
            palindrom = false;
        }

        return palindrom;
    }

    //Opgave 3
    public static boolean find(ArrayList<Integer> list, int target) {
        return find(list,target,0,list.size() - 1);
    }

    private static boolean find(ArrayList<Integer> list, int target,int left, int right) {

        boolean fundet = false;
        int middle = -1;

        if (fundet == false && left <= right) {
            middle = (left + right) / 2;
            int k = list.get(middle);

            if (k == target) {
                fundet = true;

            } else if (k > target) {
                fundet = find(list,target ,left ,middle - 1);

            } else {
                fundet = find(list,target ,middle + 1,right);
            }
        }
        return fundet;
    }



    public static void main(String[] args) {

        //Tester opgave 1
        ArrayList<Integer> tal1 = new ArrayList<>();
        tal1.add(5);
        tal1.add(10);
        tal1.add(7);
        tal1.add(9);
        tal1.add(15);
        tal1.add(20);
        System.out.println(ligetal(tal1));

        //Laver liste til opgave 1.2
        ArrayList<Integer> tal2 = new ArrayList<>();
        tal2.add(5);
        tal2.add(10);
        tal2.add(7);
        tal2.add(9);
        tal2.add(15);
        tal2.add(20);
        System.out.println(ligetal2(tal2));

        //Opgave 2
        System.out.println(palindrom("abba"));

        //Opgave 3
        ArrayList<Integer> tal3 = new ArrayList<>();
        tal3.add(1);
        tal3.add(4);
        tal3.add(5);
        tal3.add(10);
        tal3.add(12);
        tal3.add(15);
        tal3.add(18);
        tal3.add(20);
        System.out.println(find(tal3,20));
        System.out.println(find(tal3,19 ));

    }

}
