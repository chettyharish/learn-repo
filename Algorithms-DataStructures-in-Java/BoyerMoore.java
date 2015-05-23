//Program to implement Boyer Moore String Matching

public class BoyerMoore {
	int right[];
	int R = 256;
	String pat;

	public BoyerMoore(String pat) {
		right = new int[R];
		int M = pat.length();
		this.pat = pat;
		for (int i = 0; i < right.length; i++)
			right[i] = -1;

		for (int i = 0; i < M; i++)
			right[pat.charAt(i)] = i;

	}

	public int search(String txt) {
		int skip = 0;
		int N = txt.length();
		int M = pat.length();

		for (int i = 0; i <= N - M; i++) {
			skip = 0;
			for (int j = M - 1; j >= 0; j--) {
				if (pat.charAt(j) != txt.charAt(i + j)) {
					skip = Math.max(1, right[txt.charAt(i + j)]);
					break;
				}
			}
			if (skip == 0)
				return i;

		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		BoyerMoore o = new BoyerMoore("abcefg");
		System.out.println(o.search("aafafasdabcsefg"));

	}
}
