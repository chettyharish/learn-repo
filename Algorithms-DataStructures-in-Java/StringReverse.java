import java.util.StringTokenizer;

public class StringReverse {

	public static void main(String[] args) {
		String str = "I have a car and I love it";
		StringBuffer reversestr = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str);
		StackGeneric<String> stack = new StackGeneric<String>();
		while (st.hasMoreTokens()) {
			stack.push(st.nextToken());
		}

		while (stack.isEmpty() == false) {
			reversestr.append(stack.pop() + " ");
		}

		System.out.println(reversestr);
	}

}
