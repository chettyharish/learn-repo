//Program to implement Bags

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
	Node first = null;

	private class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(T data) {
		Node oldfirst = first;
		first = new Node(data);
		first.next = oldfirst;
	}

	@Override
	public Iterator<T> iterator() {

		return new ListIterator();
	}

	private class ListIterator implements Iterator<T> {
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T data = current.data;
			current = current.next;
			return data;
		}

		@Override
		public void remove() {
			// NULL
		}

	}

}
