//Program to implement Red BLack Trees

public class RBTree<Key extends Comparable<Key>, Value> {

	public static final boolean RED = true;
	public static final boolean BLACK = false;
	Node root = null;

	private class Node {
		Key key;
		@SuppressWarnings("unused")
		Value value;
		Node left, right;
		boolean color;

		public Node(Key key, Value value, boolean color) {
			this.key = key;
			this.value = value;
			this.color = color;
			left = right = null;
		}
	}

	public boolean isRed(Node x) {
		if (x == null)
			return false;
		return x.color == RED;
	}

	public Node rotateLeft(Node h) {
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	public Node rotateRight(Node h) {
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	public void flipColors(Node h) {

		h.color = RED;
		h.left.color = BLACK;
		h.right.color = RED;
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
		root.color = BLACK;
	}

	public Node put(Node h, Key key, Value value) {

		if (h == null)
			return new Node(key, value, RED);

		int cmp = key.compareTo(h.key);

		if (cmp < 0)
			h.left = put(h.left, key, value);
		else if (cmp > 0)
			h.right = put(h.right, key, value);
		else
			h.value = value;

		if (isRed(h.right) && !isRed(h.left))
			h = rotateLeft(h);
		if (isRed(h.left) && isRed(h.left.left))
			h = rotateRight(h);
		if (isRed(h.left) && isRed(h.right))
			flipColors(h);

		return h;

	}

}
