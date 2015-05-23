import java.util.*;

public class InfixToPostfix {

	public static void main(String[] args) {

		StackGeneric<Character> st = new StackGeneric<Character>();
		String infix = "2+3-5*7+9/3";
		StringBuffer postfix = new StringBuffer();

		for (int i = 0; i < infix.length(); i++) {
			if (infix.charAt(i) == '+') {
				while (true) {
					if (st.isEmpty() == true
							|| priority(infix.charAt(i)) > priority(st.peek())) {
						st.push('+');
						break;
					} else {
						postfix.append(st.pop());
					}
				}
			} else if (infix.charAt(i) == '-') {
				while (true) {
					if (st.isEmpty() == true
							|| priority(infix.charAt(i)) > priority(st.peek())) {
						st.push('-');
						break;
					} else {
						postfix.append(st.pop());
					}
				}
			} else if (infix.charAt(i) == '*') {
				while (true) {
					if (st.isEmpty() == true
							|| priority(infix.charAt(i)) > priority(st.peek())) {
						st.push('*');
						break;
					} else {
						postfix.append(st.pop());
					}
				}
			} else if (infix.charAt(i) == '/') {
				while (true) {
					if (st.isEmpty() == true
							|| priority(infix.charAt(i)) > priority(st.peek())) {
						st.push('/');
						break;
					} else {
						postfix.append(st.pop());
					}
				}
			} else {
				postfix.append(infix.charAt(i));
			}

		}

		while (st.isEmpty() == false) {
			postfix.append(st.pop());
		}

		System.out.println(postfix);
	}

	private static int priority(char charAt) {

		if (charAt == '+' || charAt == '-')
			return 1;

		if (charAt == '*' || charAt == '/')
			return 2;

		return 0;
	}
}
