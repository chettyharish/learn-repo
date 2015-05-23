//Program to implement Heap

public class BinaryHeap<Key extends Comparable<Key>> {
	private Key pq[];
	private int N;

	public BinaryHeap(int capacity) {
		pq = (Key[]) new Comparable[capacity + 1];
	}

	public void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(j, j + 1))
				j = j + 1;
			if (less(k, j)) {
				exch(k, j);
				k = j;
			} else
				break;
		}
	}

	public void swim(int k) {

		while (k > 1 && less(k / 2, k)) {
			exch(k, k / 2);
			k = k / 2;
		}
	}

	public void insert(Key x) {
		pq[++N] = x;
		swim(N);
	}

	public Key deleteMax() {
		Key max = pq[1];
		exch(1, N--);
		sink(1);
		return max;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public boolean less(int v, int w) {
		return pq[v].compareTo(pq[w]) < 0;
	}

	public void exch(int i, int j) {
		Key temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}

	public static void main(String[] args) {
		BinaryHeap<Integer> obj = new BinaryHeap<>(10);
		obj.insert(25);
		obj.insert(20);
		obj.insert(05);
		obj.insert(15);
		obj.insert(10);
		obj.insert(30);
		System.out.println(obj.deleteMax());
		System.out.println(obj.deleteMax());
		System.out.println(obj.deleteMax());
		System.out.println(obj.deleteMax());
		System.out.println(obj.deleteMax());
		System.out.println(obj.deleteMax());
	}

}
