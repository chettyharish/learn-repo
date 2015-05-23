//Program to implement Quick Union for finding paths

import java.util.Arrays;

public class QuickUnionUF {

	static int id[];

	public QuickUnionUF(int N) {
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;

	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int pid = root(p);
		int qid = root(q);
		id[qid] = pid;
	}

	public static void main(String[] args) {

		QuickUnionUF obj = new QuickUnionUF(10);
		obj.union(0, 1);
		obj.union(5, 6);
		obj.union(2, 7);
		obj.union(2, 3);
		obj.union(3, 4);
		obj.union(8, 9);

		System.out.println(obj.connected(7, 5));
		System.out.println(obj.connected(7, 4));
		System.out.println(Arrays.toString(id));

	}
}
