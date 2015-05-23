//Program to implement addition of two large strings

import java.util.Arrays;

public class Sumstrings {

	String sum(String a, String b) {

		a = new StringBuffer(a).reverse().toString();
		b = new StringBuffer(b).reverse().toString();

		char n1[] = a.toCharArray();
		char n2[] = b.toCharArray();
		char sum[] = new char[Math.max(n1.length, n2.length) + 1];
		
		for (int i = 0; i < sum.length; i++) {
			sum[i]=(char)(48);
		}
		
		int i = 0;
		int carry = 0;
		int digitsum = 0;
		while (true) {

			digitsum = n1[i] + n2[i] - 2 * 48 + carry;

			sum[i] = (char) (digitsum % 10 + 48);
			carry = digitsum / 10;
			i++;
			if (i == n1.length || i == n2.length) {
				break;
			}
		}

		if (i == n1.length && i == n2.length) {
			sum[i] = (char) (carry + 48);
		} else if (i == n1.length) {
			while (i < n2.length) {
				digitsum = n2[i] - 48 + carry;
				sum[i] = (char) (digitsum % 10 + 48);
				carry = digitsum / 10;
				i++;
			}
		} else {
			while (i < n1.length) {
				digitsum = n1[i] - 48 + carry;
				sum[i] = (char) (digitsum % 10 + 48);
				carry = digitsum / 10;
				i++;
			}
		}
		
		sum[i] = (char) (carry+ 48);


		String answer = String.valueOf(new StringBuffer(String.valueOf(sum))
				.reverse().toString());
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Sumstrings obj = new Sumstrings();
		obj.sum("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
	}

}
