package binartreestuderende_Rekusion;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {

        //Opgave 2.1 opbygger et binært træ.
        BinaryTree<Integer> femOgTyve = new BinaryTree<>(25);
        BinaryTree<Integer> tredve = new BinaryTree<>(30,femOgTyve,null);

        BinaryTree<Integer> femten = new BinaryTree<>(15);
        BinaryTree<Integer> elleve = new BinaryTree<>(11,null ,femten);

        BinaryTree<Integer> toOgTyve = new BinaryTree<>(22,elleve ,tredve);

        BinaryTree<Integer> otteOgFirs = new BinaryTree<>(88);
        BinaryTree<Integer> halvFems = new BinaryTree<>(90,otteOgFirs ,null);

        BinaryTree<Integer> syvOgHalvfjers = new BinaryTree<>(77,null ,halvFems);

        BinaryTree<Integer> femOgFyre = new BinaryTree<>(45,toOgTyve ,syvOgHalvfjers);

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
