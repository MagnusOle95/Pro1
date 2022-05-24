package binarysearchtreestuderende;

public class Main_Opgave2 {

    public static void main(String[] args) {

        BinarySearchTree<Integer> træ = new BinarySearchTree<>();
        træ.add(45);
        træ.add(22);
        træ.add(11);
        træ.add(15);
        træ.add(30);
        træ.add(25);
        træ.add(77);
        træ.add(90);
        træ.add(88);

        System.out.println(træ.findMax());
        System.out.println(træ.findMin());
        System.out.println(træ.removeMin());


    }


}
