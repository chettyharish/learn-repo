//Program to implement Quick Find for path

import java.util.Arrays;

public class QuickFindUF {

	static int id[];

	public QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid)
				id[i] = qid;
		}
	}

	public static void main(String[] args) {

		QuickFindUF obj = new QuickFindUF(10);
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
