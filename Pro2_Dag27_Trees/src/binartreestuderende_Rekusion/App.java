package binartreestuderende_Rekusion;

public class App {
    public static void main(String[] args) {

        //Opgave 2.1 opbygger et binært træ.
        BinaryTree_Opgave1_2_Og_3<Integer> femOgTyve = new BinaryTree_Opgave1_2_Og_3<>(25);
        BinaryTree_Opgave1_2_Og_3<Integer> tredve = new BinaryTree_Opgave1_2_Og_3<>(30,femOgTyve,null);

        BinaryTree_Opgave1_2_Og_3<Integer> femten = new BinaryTree_Opgave1_2_Og_3<>(15);
        BinaryTree_Opgave1_2_Og_3<Integer> elleve = new BinaryTree_Opgave1_2_Og_3<>(11,null ,femten);

        BinaryTree_Opgave1_2_Og_3<Integer> toOgTyve = new BinaryTree_Opgave1_2_Og_3<>(22,elleve ,tredve);

        BinaryTree_Opgave1_2_Og_3<Integer> otteOgFirs = new BinaryTree_Opgave1_2_Og_3<>(88);
        BinaryTree_Opgave1_2_Og_3<Integer> halvFems = new BinaryTree_Opgave1_2_Og_3<>(90,otteOgFirs ,null);

        BinaryTree_Opgave1_2_Og_3<Integer> syvOgHalvfjers = new BinaryTree_Opgave1_2_Og_3<>(77,null ,halvFems);

        BinaryTree_Opgave1_2_Og_3<Integer> femOgFyre = new BinaryTree_Opgave1_2_Og_3<>(45,toOgTyve ,syvOgHalvfjers);

        //Opgave 2.2 Tester metoden der er rekusion og udregner højden af træet.
        System.out.println(femOgFyre.treeHigh());

        //Opgave2.4 Tester de rekusive metoder preorder, inorder og postorder.
        femOgFyre.preOrder();
        System.out.println();
        femOgFyre.inOrder();
        System.out.println();
        femOgFyre.postOrder();

        //Tester opgave 3 rekusion, metode der summere værdien af hele træet.
        System.out.println();
        System.out.println(femOgFyre.sum());





    }
}
