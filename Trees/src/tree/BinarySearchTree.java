package tree;

import java.util.Stack;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	// insert the data in tree
	public boolean insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {
			if (temp.data == data)
				return false;

			// if data is greater than root's data then it should go on the right
			if (temp.data < data) {
				if (temp.right == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}

			// if data is less than root's data then it should go on the left
			else {
				if (temp.data > data) {
					if (temp.left == null) {
						temp.setLeft(newNode);
						return true;
					}
					temp = temp.getLeft();
				}

			}
		}
	}

	public void preOrder() {
		Node temp = root;
		Stack<Node> s = new Stack<Node>();

		while (temp != null || !s.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.data + " ");
				s.push(temp);
				temp = temp.left;
			}

			temp = s.pop().right;
		}

	}

	public void inOrder() {
		Node temp = root;
		Stack<Node> s = new Stack<Node>();

		while (temp != null || !s.isEmpty()) {
			while (temp != null) {
				s.push(temp);
				temp = temp.left;
			}

			temp = s.pop();
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
		System.out.println();
	}

	public void postOrder() {
		Node temp = root;

		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}

		Stack<Pair> stack = new Stack<>();
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}

			Pair pair = stack.pop();
			if (pair.flag == 'L') {
				pair.flag = 'R';
				stack.push(pair);
				temp = pair.node.getRight();
			} else {
				System.out.print(pair.node.getData() + " ");
				temp = null; // Ensure to break the inner while loop
			}
		}
		System.out.println();
	}

}
