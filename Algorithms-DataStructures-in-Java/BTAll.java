package DataStructures;

import java.util.LinkedList;

class BTNode {
	int value;
	BTNode left;
	BTNode right;

}

class BT {

	BTNode rootNode = null;
	BTNode markedNode = null;
	BTNode parentNode = null;
	BTNode successorNode = null;

	public void insert(int value) {

		BTNode inserBtNode = new BTNode();
		inserBtNode.value = value;
		inserBtNode.left = null;
		inserBtNode.right = null;
		markedNode = rootNode;
		if (rootNode == null) {
			rootNode = inserBtNode;
		} else {
			while (true) {
				if (value <= markedNode.value) {
					if (markedNode.left == null) {
						markedNode.left = inserBtNode;
						return;
					} else {
						markedNode = markedNode.left;
					}
				} else {
					if (markedNode.right == null) {
						markedNode.right = inserBtNode;
						return;
					} else {
						markedNode = markedNode.right;
					}
				}
			}
		}
	}

	public BTNode search(int value) {
		markedNode = rootNode;
		while (true) {
			if (markedNode != null) {
				if (value == markedNode.value) {
					return markedNode;
				} else if (value <= markedNode.value) {
					markedNode = markedNode.left;
				} else {
					markedNode = markedNode.right;
				}
			} else {
				return null;
			}
		}

	}

	public BTNode findParent(BTNode childBtNode) {
		markedNode = rootNode;
		while (true) {
			if (markedNode != null && childBtNode != null) {
				if (markedNode.left == childBtNode
						|| markedNode.right == childBtNode) {
					return markedNode;
				} else {
					if (childBtNode.value <= markedNode.value) {
						markedNode = markedNode.left;
					} else {
						markedNode = markedNode.right;
					}
				}
			} else {
				return null;
			}
		}
	}

	public BTNode findSuccessor(BTNode deletedNode) {
		markedNode = deletedNode.right;
		if (deletedNode.left == null) {
			return markedNode;
		} else {
			while (true) {
				if (markedNode.left != null) {
					markedNode = markedNode.left;
				} else {
					return markedNode;
				}
			}
		}

	}

	public void delete(int value, BTNode startNode) {

		if (rootNode.value == value) {

			BTNode deletedNode = rootNode;
			if (markedNode.left == null && markedNode.right == null) {
				rootNode = null;
			} else if (markedNode.left == null || markedNode.right == null) {
				if (markedNode.left != null) {
					rootNode = rootNode.left;
				} else {
					rootNode = rootNode.right;
				}
			} else {
				successorNode = findSuccessor(deletedNode);
				int replaceValue = successorNode.value;
				delete(successorNode.value, rootNode);
				deletedNode.value = replaceValue;
			}

		} else {
			markedNode = search(value);
			if (markedNode.left == null && markedNode.right == null) {
				deleteZeroChild(markedNode);
			} else if (markedNode.left == null || markedNode.right == null) {
				deleteOneChild(markedNode);
			} else {
				deleteTwoChild(markedNode);
			}
		}

	}

	public void deleteZeroChild(BTNode deletedNode) {
		parentNode = findParent(deletedNode);
		if (parentNode.left == deletedNode)
			parentNode.left = null;
		else
			parentNode.right = null;
	}

	public void deleteOneChild(BTNode deletedNode) {
		parentNode = findParent(deletedNode);
		if (parentNode.left == deletedNode) {
			if (deletedNode.left != null)
				parentNode.left = deletedNode.left;
			else
				parentNode.left = deletedNode.right;
		} else {
			if (deletedNode.left != null)
				parentNode.right = deletedNode.left;
			else
				parentNode.right = deletedNode.right;
		}
	}

	public void deleteTwoChild(BTNode deletedNode) {
		parentNode = findParent(deletedNode);
		successorNode = findSuccessor(deletedNode);

		int value = successorNode.value;
		delete(successorNode.value, rootNode);
		deletedNode.value = value;
	}

	public void BFS() {
		LinkedList<BTNode> queueNode = new LinkedList<BTNode>();
		int counter = 0;
		if (rootNode != null) {
			queueNode.add(rootNode);
		} else {
			System.out.println("Empty Tree");
			return;
		}
		while (counter < queueNode.size()) {
			if (queueNode.get(counter).left != null)
				queueNode.add(queueNode.get(counter).left);
			if (queueNode.get(counter).right != null)
				queueNode.add(queueNode.get(counter).right);
			counter++;
		}

		counter = 0;
		while (counter < queueNode.size()) {
			System.out.print(queueNode.get(counter).value + "    ");
			counter++;
		}
		System.out.println();

	}

	public void preOrder(BTNode expandBtNode) {
		if (expandBtNode == null)
			return;

		System.out.print(expandBtNode.value + "    ");
		preOrder(expandBtNode.left);
		preOrder(expandBtNode.right);
	}

	public void inOrder(BTNode expandBtNode) {
		if (expandBtNode == null)
			return;

		inOrder(expandBtNode.left);
		System.out.print(expandBtNode.value + "    ");
		inOrder(expandBtNode.right);
	}

	public void postOrder(BTNode expandBtNode) {
		if (expandBtNode == null)
			return;

		postOrder(expandBtNode.left);
		postOrder(expandBtNode.right);
		System.out.print(expandBtNode.value + "    ");
	}

}

public class BTAll {

	public static void main(String[] args) {

		BT obj = new BT();

		obj.insert(50);
		obj.insert(30);
		obj.insert(15);
		obj.insert(40);
		obj.insert(35);
		obj.insert(45);
		obj.insert(70);
		obj.insert(60);
		obj.insert(88);
		obj.insert(75);
		obj.insert(72);
		obj.insert(77);
		obj.BFS();

		obj.delete(50, obj.rootNode);
		obj.BFS();

	}

}
