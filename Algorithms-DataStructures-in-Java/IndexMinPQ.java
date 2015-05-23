//Program to implement Index Priority Queue for min values

public class IndexMinPQ<Key extends Comparable<Key>> {

	int max;
	private int N;
	private int pq[];
	private int qp[];
	private Key keys[];

	public IndexMinPQ(int max) {
		this.max = max;
		N = 0;
		keys = (Key[]) new Comparable[max + 1];
		pq = new int[max + 1];
		qp = new int[max + 1];

		for (int i = 0; i < pq.length; i++) {
			qp[i] = -1;
		}
	}

	public boolean isEmpty() {
		return N == 0;
	}

	void insert(int i, Key key) {
		N++;
		qp[i] = N;
		pq[N] = i;
		keys[i] = key;
		swim(N);
	}

    public void decreaseKey(int i, Key key) {
        keys[i] = key;
        swim(qp[i]);
    }

	boolean contains(int i) {
		return qp[i] != -1;
	}

	private void swim(int k) {
		while (k > 1 && greater(k / 2, k)) {
			exch(k, k / 2);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && greater(j, j + 1))
				j++;
			if (!greater(k, j))
				break;
			exch(k, j);
			k = j;
		}
	}

	int delMin() {
		int min = pq[1];
		exch(1, N--);
		sink(1);
		qp[min] = -1; 
		keys[pq[N + 1]] = null;
		pq[N + 1] = -1;
		return min;
	}

	int size() {
		return N;
	}

	private boolean greater(int i, int j) {
		return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
	}

	private void exch(int i, int j) {
		int swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
		qp[pq[i]] = i;
		qp[pq[j]] = j;
	}

}
