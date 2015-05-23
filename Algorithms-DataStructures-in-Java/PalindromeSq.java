//Program to find Longest Palindrome - > Dynamic Programming

public class PalindromeSq {

	public static void main(String[] args) {
		char seq[] = { 'B', 'A', 'A', 'B' };
		PalindromeSq obj = new PalindromeSq();
		System.out.println(obj.searchPalindrome(seq, 0, seq.length - 1));
	}

	private int searchPalindrome(char[] seq, int i, int j) {
		if (i > j)
			return 0; // crossing point
		else if (i == j)
			return 1; // same element so 1
		else if (seq[i] == seq[j])
			return searchPalindrome(seq, i + 1, j - 1) + 2; // Match Found
		else
			// Match not found, so moving inside from both directions.
			return Math.max(searchPalindrome(seq, i + 1, j),
					searchPalindrome(seq, i, j - 1));
	}

}
