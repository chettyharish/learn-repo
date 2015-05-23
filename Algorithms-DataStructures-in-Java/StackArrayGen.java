//Program to implement Stack using Arrays for generic data

public class StackArrayGen<Gentype> {

	private Gentype items[];
	private int N = 0;

	public StackArrayGen() {
		items = (Gentype[]) new Object[10];
	}

	public void push(Gentype value) {
		items[N++] = value;
	}

	public Gentype pop() {
		return items[--N];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public static void main(String[] args) {
		StackGeneric<Integer> obj = new StackGeneric<>();

		obj.push(20);

		System.out.println(obj.pop());
	}

}
