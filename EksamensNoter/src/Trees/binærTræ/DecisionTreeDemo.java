package Trees.binærTræ;

import java.util.Scanner;

/**
 * This program demonstrates a decision tree for an animal guessing game.
 */
public class DecisionTreeDemo {
	public static void main(String[] args) {

		BinaryTree_Opgave1_2_Og_3<String> tiger = new BinaryTree_Opgave1_2_Og_3<String>("It ia a tiger.");
		BinaryTree_Opgave1_2_Og_3<String> zebra = new BinaryTree_Opgave1_2_Og_3<String>("It is a zebra.");
		BinaryTree_Opgave1_2_Og_3<String> canivore = new BinaryTree_Opgave1_2_Og_3<String>(
				"Is it a carnivore?", tiger, zebra);

		BinaryTree_Opgave1_2_Og_3<String> pig = new BinaryTree_Opgave1_2_Og_3<String>("It is a pig.");
		BinaryTree_Opgave1_2_Og_3<String> stripes = new BinaryTree_Opgave1_2_Og_3<String>(
				"Does it have stripes?", canivore, pig);

		BinaryTree_Opgave1_2_Og_3<String> penguin = new BinaryTree_Opgave1_2_Og_3<String>("It is a penguin.");
		BinaryTree_Opgave1_2_Og_3<String> ostrich = new BinaryTree_Opgave1_2_Og_3<String>("It is an ostrich.");
		BinaryTree_Opgave1_2_Og_3<String> swim = new BinaryTree_Opgave1_2_Og_3<String>("Does it swim?",
				penguin, ostrich);

		BinaryTree_Opgave1_2_Og_3<String> eagle = new BinaryTree_Opgave1_2_Og_3<String>("It is an eagle.");
		BinaryTree_Opgave1_2_Og_3<String> fly = new BinaryTree_Opgave1_2_Og_3<String>("Does it fly?", eagle,
				swim);

		BinaryTree_Opgave1_2_Og_3<String> questionTree = new BinaryTree_Opgave1_2_Og_3<String>(
				"Is it a mammal?", stripes, fly);

		// questionTree.inorder();
		boolean done = false;
		Scanner in = new Scanner(System.in);
		while (!done) {
			BinaryTree_Opgave1_2_Og_3<String> left = questionTree.left();
			BinaryTree_Opgave1_2_Og_3<String> right = questionTree.right();
			if (left.isEmpty() && right.isEmpty()) {
				System.out.println(questionTree.data());
				done = true;
			} else {
				String response;
				do {
					System.out.print(questionTree.data() + " (Y/N) ");
					response = in.next().toUpperCase();
				} while (!response.equals("Y") && !response.equals("N"));

				if (response.equals("Y")) {
					questionTree = left;
				} else {
					questionTree = right;
				}
			}
		}
		in.close();
	}
}
