package hovedspgsmNN;

public class App {

    public static void main(String[] args) {
     BinaryTree<String> to = new BinaryTree<>("2");
     BinaryTree<String> fire = new BinaryTree<>("4");
     BinaryTree<String> plus2Og4 = new BinaryTree<>("+",to,fire);

     BinaryTree<String> syv = new BinaryTree<>("7");
     BinaryTree<String> gange = new BinaryTree<>("*",plus2Og4,syv);


     BinaryTree<String> tre = new BinaryTree<>("3");
     BinaryTree<String> otte = new BinaryTree<>("8");

     BinaryTree<String> plus3Og8 = new BinaryTree<>("+",tre,otte);

     BinaryTree<String> plusGangeOgPlus = new BinaryTree<>("+",gange,plus3Og8);

     System.out.println(plusGangeOgPlus.countElement("+"));




    }



}
