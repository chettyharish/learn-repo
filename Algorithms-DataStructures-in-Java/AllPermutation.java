//Program to find Permutations ->Dynamic Programming

import java.util.Arrays;

public class AllPermutation {

	public static void main(String[] args) {
		char perm[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		AllPermutation obj = new AllPermutation();
		obj.printPermutation(perm, 0, perm.length);
	}

	private void printPermutation(char[] perm, int k, int length) {

		if (k == length - 1) {
			System.out.println(Arrays.toString(perm));
			return;
		}

		for (int i = k; i < perm.length; i++) {
			swap(perm, i, k);
			printPermutation(perm, k + 1, length);
			swap(perm, i, k);
		}

	}

	private void swap(char[] perm, int i, int k) {
		char temp = perm[i];
		perm[i] = perm[k];
		perm[k] = temp;
	}

}
