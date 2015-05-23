//Program to implement Knuth Morris Pratt String Matching algorithm



public class KMP {
	int dfa[][];
	int M;

	public KMP(String pat) {
		int R = 256;
		M = pat.length();
		dfa = new int[R][M];
		int X = 0;
		dfa[pat.charAt(0)][0] = 1;

		for (int j = 0; j < M; j++) {

			for (int c = 0; c < R; c++)
				dfa[c][j] = dfa[c][X];

			dfa[pat.charAt(j)][j] = j + 1;

			X = dfa[pat.charAt(j)][X];
		}

	}

	public int search(String tct) {
		int i, j = 0, N = tct.length();
		for (i = 0; i < N; i++)
			j = dfa[tct.charAt(i)][j];

		if (j == M)
			return i - M;
		else
			return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		KMP p = new KMP("abcd");

		System.out.println(p.search("dnabscd"));
	}
}
