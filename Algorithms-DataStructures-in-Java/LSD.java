//Program to implement sorting with Least Significant DIgit

import java.util.Arrays;

public class LSD {

	public void sort(String a[], int W) {

		int R = 256;
		int N = a.length;

		String aux[] = new String[N];

		for (int d = W - 1; d >= 0; d--) {
			int count[] = new int[R + 1];

			for (int i = 0; i < N; i++) {
				count[a[i].charAt(d) + 1]++;
			}

			for (int i = 0; i < R; i++) {
				count[i + 1] = count[i] + count[i + 1];
			}

			for (int i = 0; i < N; i++) {
				aux[count[a[i].charAt(d)]++] = a[i];
			}

			for (int i = 0; i < N; i++) {
				a[i] = aux[i];
			}
		}

	}

	public static void main(String[] args) {
		LSD p = new LSD();
		String a[] = { "cat", "dog", "man", "fan", "lan", "zen", "pen", "run",
				"rod", "lad", "fad", "dad", "mad", "sad", "pad", "bad" };

		p.sort(a, 3);
		System.out.println(Arrays.toString(a));
	}
}
