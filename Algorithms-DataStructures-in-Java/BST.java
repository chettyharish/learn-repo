//Program to implement Binary Search Tree

public class BST<Key extends Comparable<Key>, Value> {

	Node root;

	private class Node {
		private Value value;
		private Key key;
		private Node left, right;
		private int count;

		public Node(Key key, Value value) {
			this.value = value;
			this.key = key;
			this.count = 1;
		}

	}

	public int size(Node x) {
		if (x == null)
			return 0;
		// System.out.println(x.count);
		return x.count;
	}

	public Value get(Key k) {

		Node x = root;

		while (x != null) {

			int cmp = k.compareTo(x.key);

			if (cmp < 0)
				x = x.left;
			else if (cmp > 0)
				x = x.right;
			else
				return x.value;
		}
		return null;
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	public Node put(Node x, Key key, Value value) {

		if (x == null)
			return new Node(key, value);

		int cmp = key.compareTo(x.key);

		if (cmp < 0)
			x.left = put(x.left, key, value);
		else if (cmp > 0)
			x.right = put(x.right, key, value);
		else
			x.value = value;
		x.count = 1 + size(x.left) + size(x.right);
		return x;
	}

	public Node min(Node x) {

		while (x.left != null)
			x = x.left;
		return x;
	}

	public Node max(Node x) {

		while (x.right != null)
			x = x.right;
		return x;
	}

	public Node deleteMin(Node x) {
		if (x.left == null)
			return x.right;
		x.left = deleteMin(x.left);
		return x;
	}

	public void delete(Key key) {
		root = delete(root, key);
	}

	public Node delete(Node x, Key key) {
		if (x == null)
			return null;

		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.left = delete(x.left, key);
		else if (cmp > 0)
			x.right = delete(x.right, key);
		else {
			if (x.right == null)
				return x.left;

			Node t = x;
			x = min(x.right);
			x.right = deleteMin(t.right);
			x.left = t.left;

		}

		return x;
	}

	public void inorder() {
		inorder(root);
	}

	public void inorder(Node x) {
		if (x == null)
			return;
		inorder(x.left);
		System.out.print(x.key + "," + x.count + "  ");
		inorder(x.right);

	}

	public Key floor(Key key) {
		Node x = floor(root, key);
		if (x == null)
			return null;
		return x.key;
	}

	public Node floor(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);

		if (cmp == 0)
			return x;

		if (cmp < 0)
			return floor(x.left, key);

		Node t = floor(x.right, key);
		if (t != null)
			return t;
		return x;
	}

	public int rank(Key key) {
		return rank(root, key);
	}

	public int rank(Node x, Key key) {

		if (x == null)
			return 0;
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			return rank(x.left, key);
		else if (cmp > 0)
			return 1 + size(x.left) + rank(x.right, key);
		else
			return size(x.left);

	}

	public static void main(String[] args) {

		BST<Integer, Integer> obj = new BST<>();
		obj.put(50, 30);
		obj.put(10, 10);
		obj.put(70, 20);
		obj.put(55, 50);
		obj.put(90, 40);
		obj.put(53, 60);
		obj.put(65, 60);
		obj.put(75, 60);
		// System.out.println(obj.size(obj.root));
		 System.out.println(obj.rank(70));
		// obj.delete(70);
		// obj.delete(50);
		obj.inorder();

	}

}
