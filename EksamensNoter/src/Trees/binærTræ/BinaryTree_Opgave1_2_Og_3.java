package Trees.binærTræ;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree_Opgave1_2_Og_3<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree_Opgave1_2_Og_3() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree_Opgave1_2_Og_3(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public BinaryTree_Opgave1_2_Og_3(E rootData, BinaryTree_Opgave1_2_Og_3<E> left, BinaryTree_Opgave1_2_Og_3<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree_Opgave1_2_Og_3<E> left() {
		BinaryTree_Opgave1_2_Og_3<E> result = new BinaryTree_Opgave1_2_Og_3<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree_Opgave1_2_Og_3<E> right() {
		// TODO exercise 1
		BinaryTree_Opgave1_2_Og_3<E> result = new BinaryTree_Opgave1_2_Og_3<E>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		// TODO exercise 1
		E oldData = root.data;
		root.data = rootData;
		return oldData;
	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		// TODO exercise 1
		return n.left == null && n.right == null;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		// TODO exercise 1
		return n.left != null || n.right != null;
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		// TODO exercise 1
		int sum;
		if (n == null){
			sum = 0;
		} else{
			int count1 = size(n.left);
			int count2 = size(n.right);
			sum = count1 + count2 + 1;
		}
		return sum;
	}

	//Opgave 2.2 Metode der finder højden af træet rekusiv.
	public int treeHigh(){
		return treeHigh(root);
	}

	private int treeHigh(Node n){
		int sum;
		if (n == null){
			sum = 0;
		}else{
			int left = treeHigh(n.left);
			int right = treeHigh(n.right);
			sum = Math.max(left,right);
			sum += 1;
		}

		return sum;
	}


	//Opgave 2.3 rekusiv Preorder.
	public void preOrder(){
		preOrder(root);
	}

	private void preOrder(Node n){
		if (n == null){
			//Gør ingenting.
		}else{
			System.out.print(n.data + ": ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}


	//Opgave 2.3 rekusiv Inorder.
	public void inOrder(){
		inOrder(root);
	}

	private void inOrder(Node n){
		if (n == null){
			//Gør ingenting
		}else{
			inOrder(n.left);
			System.out.print(n.data + ": ");
			inOrder(n.right);
		}
	}


	//Opgave 2.3 rekusiv Postorder.
	public void postOrder(){
		postOrder(root);
	}

	private void postOrder(Node n){
		if (n == null){
			//Gør ingenting
		}else{
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data + ": ");
		}
	}

	//Opgave 3 Rekusiv metode der summere antallet af hele træet.
	public int sum(){
		return sum(root);
	}

	private int sum(Node n){
		int sum;
		if (n == null){
			sum = 0;
		}else{
			int left = sum(n.left);
			int right = sum(n.right);
			sum = left + right;
			sum += (int) n.data;
		}
		return sum;
	}


	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
