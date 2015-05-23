//Program to implement String Interleaving ->Dynamic Programming

import java.util.Arrays;

public class StringInterleaves {

	public static void main(String[] args) {
		StringInterleaves obj = new StringInterleaves();
		String str1 = "AB";
		String str2 = "CD";
		Character arr[] = new Character[str1.length() + str2.length()];
		obj.printInterleaves(str1, str2, 0, 0, 0, arr);
	}

	private void printInterleaves(String str1, String str2, int i, int j,
			int k, Character str[]) {

		if (i == str1.length() && j == str2.length()) {
			System.out.println(Arrays.toString(str));
		}

		if (i < str1.length()) {
			str[k] = str1.charAt(i);
			printInterleaves(str1, str2, i + 1, j, k + 1, str);
		}

		if (j < str2.length()) {
			str[k] = str2.charAt(j);
			printInterleaves(str1, str2, i, j + 1, k + 1, str);
		}

	}
}
