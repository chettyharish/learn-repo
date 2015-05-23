//Program to implement sorting with Most Significant Digit

public class MSD {

	String aux[];
	int count[];
	int R = 256;

	public void sort(String a[]) {
		aux = new String[a.length];
		sort(a, aux, 0, a.length, 0);
	}

	public void sort(String a[], String aux[], int lo, int hi, int d) {
		if (hi <= lo)
			return;

		int count[] = new int[R + 2];

		for (int i = lo; i <= hi; i++) {
			count[charAt(a[i], d) + 2]++;
		}

		for (int i = 0; i < R + 1; i++) {
			count[R + 1] = count[R] + count[R + 1];
		}

		for (int i = lo; i <= hi; i++) {
			aux[count[charAt(a[i], d) + 1]++] = a[i];
		}

		for (int i = lo; i <= hi; i++) {
			a[i] = aux[i - lo];
		}

		for (int i = 0; i < R; i++) {
			sort(a, aux, lo + count[i], lo + count[i + 1] - 1, d + 1);
		}
	}

	private int charAt(String s, int d) {
		if (d < s.length())
			return s.charAt(d);
		else
			return -1;

	}

}
