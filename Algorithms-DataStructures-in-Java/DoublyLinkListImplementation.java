package DataStructures;

class DoublyLinkListNode {
	int value;
	DoublyLinkListNode next;
	DoublyLinkListNode prev;
}

class DoublyLinkList {
	DoublyLinkListNode firstNode = null;
	DoublyLinkListNode lastNode = null;

	public void addDoublyLinkList(int value) {
		if (firstNode == null) {
			DoublyLinkListNode newNode = new DoublyLinkListNode();
			newNode.value = value;
			firstNode = newNode;
			lastNode = newNode;
			newNode.next = null;
			newNode.prev = null;
		} else {
			DoublyLinkListNode newNode = new DoublyLinkListNode();
			newNode.value = value;
			lastNode.next = newNode;
			newNode.prev = lastNode;
			lastNode = newNode;
			lastNode.next = null;

		}
	}

	public void addElementAtDoublyLinkList(int value, int position) {
		DoublyLinkListNode markedNode = firstNode;
		int counter = 1;

		while (counter < position) {
			if (markedNode != null && markedNode != lastNode) {
				markedNode = markedNode.next;
				counter++;
			} else {
				System.out.println("The link list is smaller");
				return;
			}
		}

		if (markedNode == firstNode) {
			DoublyLinkListNode newNode = new DoublyLinkListNode();
			newNode.value = value;
			newNode.next = firstNode;
			firstNode.prev = newNode;
			firstNode = newNode;
		} else {

			DoublyLinkListNode newNode = new DoublyLinkListNode();
			newNode.value = value;

			markedNode.prev.next = newNode;
			newNode.prev = markedNode.prev;
			newNode.next = markedNode;
			markedNode.prev = markedNode.prev.next;

		}

	}

	public void deleteDoublyLinkList(int value) {
		DoublyLinkListNode markedNode = firstNode;
		if (firstNode.value == value) {
			firstNode = firstNode.next;
			firstNode.prev = null;
			return;
		} else if (lastNode.value == value) {
			lastNode = lastNode.prev;
			lastNode.next = null;
		} else {
			{
				markedNode = firstNode;
				while (markedNode != null) {
					if (markedNode.value == value) {
						markedNode.prev.next = markedNode.next;
						markedNode.next.prev = markedNode.prev;
						return;
					}
					markedNode = markedNode.next;
				}
			}

		}
		System.out.println("Element Not Found");

	}

	public void deleteElementAtDoublyinkList(int position) {
		DoublyLinkListNode markedNode = firstNode;
		int counter = 1;
		while (counter < position) {
			if (markedNode != null && markedNode != lastNode) {
				markedNode = markedNode.next;
				counter++;

			} else {
				System.out.println("The link list is smaller");
				return;
			}
		}

		if (markedNode == firstNode) {
			firstNode = firstNode.next;
			firstNode.prev = null;
		} else if (markedNode == lastNode) {
			lastNode = lastNode.prev;
			lastNode.next = null;
		} else {
			markedNode.prev.next = markedNode.next;
			markedNode.next.prev = markedNode.prev;
		}

	}

	public void searchDoublyLinkList(int value) {
		DoublyLinkListNode markedNode = firstNode;
		int counter = 0;
		while (markedNode != null) {
			counter++;

			if (markedNode.value == value) {
				System.out.println("Element Found at spot :  " + counter);
				return;
			}

			markedNode = markedNode.next;
		}
		System.out.println("Element Not Found");
	}

	public void printDoublyLinkListUsingNext() {
		DoublyLinkListNode markedNode = firstNode;

		while (markedNode != null) {
			System.out.print(markedNode.value + "   ");
			markedNode = markedNode.next;
		}
		System.out.println();
	}

	public void printDoublyLinkListUsingPrev() {
		DoublyLinkListNode markedNode = lastNode;

		while (markedNode != null) {
			System.out.print(markedNode.value + "   ");
			markedNode = markedNode.prev;
		}
		System.out.println();
	}

}

public class DoublyLinkListImplementation {
	public static void main(String[] args) {

		DoublyLinkList obj = new DoublyLinkList();
		obj.addDoublyLinkList(10);
		obj.addDoublyLinkList(20);
		obj.addDoublyLinkList(40);
		obj.addDoublyLinkList(60);
		obj.addDoublyLinkList(80);

		obj.addElementAtDoublyLinkList(12, 1);

		obj.addElementAtDoublyLinkList(18, 3);

		obj.addElementAtDoublyLinkList(122, 5);

		obj.printDoublyLinkListUsingNext();
		obj.deleteElementAtDoublyinkList(1);
		obj.printDoublyLinkListUsingNext();
	}
}
