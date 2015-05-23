//Program to implement Weighted Union Find for finding paths

import java.util.Arrays;

public class WeightedUF {
	static int id[], sz[];

	public WeightedUF(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			sz[i] = 1;
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

		
			if (sz[p] < sz[q]) {
				id[pid] = qid;
				sz[qid] = sz[qid] + sz[pid];
			} else {
				id[qid] = pid;
				sz[pid] = sz[pid] + sz[qid];
			}
		
	}

	public static void main(String[] args) {

		WeightedUF obj = new WeightedUF(10);
		obj.union(0, 1);
		obj.union(5, 6);
		obj.union(2, 7);
		obj.union(2, 3);
		obj.union(3, 4);
		obj.union(8, 9);

		System.out.println(obj.connected(7, 5));
		System.out.println(obj.connected(7, 4));
		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(sz));

	}

}
