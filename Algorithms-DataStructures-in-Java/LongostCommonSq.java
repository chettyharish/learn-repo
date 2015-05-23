//Program to find Longest Common sequence (Non-Contiguous)- > Dynamic Programming

public class LongostCommonSq {

	public static void main(String[] args) {
		String s1 = "ABACEB";
		String s2 = "ADBAVCEB";
		char[] A = s1.toCharArray();
		char[] B = s2.toCharArray();

		int LCS[][] = new int[A.length][B.length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					if (i == 0 || j == 0) {
						LCS[i][j] = 1;
					} else {
						LCS[i][j] = 1 + LCS[i - 1][j - 1];
					}
				} else {
					if (i == 0 && j == 0) {
						LCS[i][j] = 0;
					} else if (i == 0) {
						LCS[i][j] = LCS[i][j - 1];
					} else if (j == 0) {
						LCS[i][j] = LCS[i - 1][j];
					} else {
						LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
					}
				}

			}
		}

		System.out.println("LCS is :" + LCS[A.length - 1][B.length - 1]);

	}
}
