package DataStructures;

class CircularLinkListNode {
	int value;
	CircularLinkListNode next;
}

class CircularLinkList {
	LinkedListNode firstNode = null;
	LinkedListNode lastNode = null;

	public void addCircularLinkList(int value) {
		LinkedListNode newNode = new LinkedListNode();
		newNode.value = value;
		if (lastNode == null) {
			firstNode = newNode;
			lastNode = newNode;
			newNode.next = firstNode;
		} else {
			lastNode.next = newNode;
			lastNode = newNode;
			lastNode.next = firstNode;
		}
	}

	public void deleteCircularLinkList(int value) {

		if (firstNode.value == value) {
			firstNode = firstNode.next;
			lastNode.next = firstNode;
			System.out.println("Node deleted");
			return;
		} else {

			LinkedListNode markedNode = firstNode;
			while (markedNode.next != null) {
				if (markedNode.next.value == value) {
					markedNode.next = markedNode.next.next;
					System.out.println("Node deleted");
					return;
				}

				markedNode = markedNode.next;
			}
		}
		System.out.println("Nothing deleted");
	}

	public void printCircularLinkList() {
		LinkedListNode markedNode = firstNode;
		do {
			System.out.print(markedNode.value + "   ");
			markedNode = markedNode.next;
		} while (markedNode != lastNode);
		System.out.println();
	}

	public void searchCircularLinkList(int value) {
		LinkedListNode markedNode = firstNode;
		int counter = 0;
		do {
			counter++;
			if (markedNode.value == value) {
				System.out.println("Node found at spot : " + counter);
				return;
			}
			markedNode = markedNode.next;
		} while (markedNode != lastNode);
		System.out.println("Node not found");
	}

	public void detectLoop() {
		LinkedListNode slowNode = firstNode;
		LinkedListNode fastNode = firstNode.next;
		int i = 1;
		while (slowNode != fastNode) {
			if (slowNode.next != null && fastNode.next.next != null) {
				slowNode = slowNode.next;
				fastNode = fastNode.next.next;

				System.out.println("Iteration number : " + i + "   "
						+ slowNode.value + "    " + fastNode.value);
				i++;
			} else {
				System.out.println("Loop not detected");
				return;
			}

		}

		System.out.println("Loop Detected at Node Value : " + slowNode.value);
	}

}

// public class CircularLinkListImplementation {
// public static void main(String[] args) {
// CircularLinkList obj = new CircularLinkList();
// obj.addCircularLinkList(15);
// obj.addCircularLinkList(56);
// obj.addCircularLinkList(23);
// obj.addCircularLinkList(14);
// obj.addCircularLinkList(17);
// obj.addCircularLinkList(16);
// obj.printCircularLinkList();
// obj.searchCircularLinkList(17);
//
// obj.deleteCircularLinkList(17);
// obj.searchCircularLinkList(17);
// }
// }
