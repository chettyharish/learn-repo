//Program to implement TST Trie

public class TSTTrie<Value> {

	private Node root;

	private class Node {
		Value val;
		char c;
		Node left, right, mid;
	}

	public void put(String key, Value val) {
		root = put(root, key, val, 0);
	}

	public Node put(Node x, String key, Value val, int d) {
		char c = key.charAt(d);

		if (x == null) {
			x = new Node();
			x.c = c;
		}
		if (c < x.c)
			x.left = put(x.left, key, val, d);
		else if (c > x.c)
			x.right = put(x.right, key, val, d);
		else if (d == key.length() - 1)
			x.mid = put(x.mid, key, val, d + 1);
		else
			x.val = val;
 
		return x;
	}

	public Value get(String key) {
		Node x = get(root, key, 0);
		if (x == null)
			return null;
		return x.val;
	}

	public Node get(Node x, String key, int d) {
		if (x == null)
			return null;
		char c = key.charAt(d);
		if (c < x.c)
			return get(x.left, key, d);
		else if (c > x.c)
			return get(x.right, key, d);
		else if (c < key.length() - 1)
			return get(x.mid, key, d + 1);
		else
			return x;
	}

	public boolean contains(String key) {
		return get(key) != null;
	}

	public static void main(String[] args) {
		TSTTrie<Integer> s = new TSTTrie<>();
		s.put("shell", 5);
		s.put("she", 6);
		s.put("car", 4);
		s.put("fat", 1);
		System.out.println(s.get("car"));
	}

}
