public class PostfixEvaluation {

	public static void main(String[] args) {
		String postfix = "23+79*-";

		Stack stack = new Stack();

		for (int i = 0; i < postfix.length(); i++) {
			if (postfix.charAt(i) == '+') {
				int v1 = stack.pop();
				int v2 = stack.pop();
				stack.push(v2 + v1);
			} else if (postfix.charAt(i) == '-') {
				int v1 = stack.pop();
				int v2 = stack.pop();
				stack.push(v2 - v1);
			} else if (postfix.charAt(i) == '*') {
				int v1 = stack.pop();
				int v2 = stack.pop();
				stack.push(v1 * v2);
			} else if (postfix.charAt(i) == '/') {
				int v1 = stack.pop();
				int v2 = stack.pop();
				stack.push(v2 / v1);
			} else if (postfix.charAt(i) == '^') {
				int v1 = stack.pop();
				int v2 = stack.pop();
				stack.push((int) Math.pow(v2, v1));
			} else {
				stack.push((int) postfix.charAt(i) - 48);
			}
		}
		System.out.println(stack.pop());
	}

}
