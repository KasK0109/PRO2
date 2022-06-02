package binartreestuderende;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree(E rootData) {
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
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
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
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {

		BinaryTree<E> result = new BinaryTree<E>();
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

		E oldData = root.data;
		root.data = rootData;
		return oldData;

	}

	/**
	 *
	 * @param n
	 * @return true in n has 	no children
	 */
	private boolean isLeaf(Node n) {
		return n.left == null && n.right == null;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		return n.left == null || n.right == null;
	}


	// ---------------------------------------------
	// Returns the number of nodes in a tree
	// ---------------------------------------------
	public int size() {
		return size(root);
	}

	private int size(Node n) {

		if (n == null) {
			return 0;
		} else {
			return (size(n.left) + size(n.right) + 1);
		}

	}

	// ---------------------------------------------
	// Returns the height of the tree
	// FORKERT - Skal give 4 mangler en root note :/
	// ---------------------------------------------

	public int height() {
		return height(root);
	}

	private int height(Node n) {
		if (n == null) {
			return -1;
		}

		int leftHeight = height(n.left);
		int rightHeight = height(n.right);

		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}


	// ---------------------------------------------
	// Pre Order traverse
	// ---------------------------------------------

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node n) {

		if (n == null) {
			return;
		}
		System.out.print(n.data + " -> ");
		preOrder(n.left);
		preOrder(n.right);
	}


	// ---------------------------------------------
	// In Order traverse
	// ---------------------------------------------

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node n) {

		if (n == null) {
			return;
		}

		inOrder(n.left);
		System.out.print(n.data + " -> ");
		inOrder(n.right);
	}

	// ---------------------------------------------
	// Post Order traverse
	// ---------------------------------------------

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node n) {

		if (n == null) {
			return;
		}

		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data + " -> ");
	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node n) {

		if (n == null) {
			return 0 ;
		}

		return ((int) n.data + sum(n.left) + sum(n.right));
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
