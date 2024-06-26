package singly;

public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			System.out.println("added : " + head.data);
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.setNext(newNode);
		// temp = temp.next;
		System.out.println("added : " + newNode.data);
	}

	// insert at 1st position
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			System.out.println("added : " + head.data);
			return;
		}

		newNode.setNext(head);
		head = newNode;
		System.out.println("added : " + head.data);
	}

	// insert at given position
	public void insert(int data, int position) {
		Node newNode = new Node(data);
		if (head == null && position > 1) {
			System.out.println("position not valid for list");
			return;
		}
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.next;
			if (prev == null) {
				System.out.println("posstion not valid");
				return;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
	}

	// delete firstNode
	public void delete() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}

		head = head.next;
		System.out.println("First element deleted");

	}

	// delete by value
	public boolean delete(int data) {
		if (head == null) {
			System.out.println("Empty list");
			return false;
		}

		if (data == head.data) {
			head = head.next;
			return true;
		}

		Node del = head;
		Node prev = head;
		while (del.data != data) {
			prev = del;
			del = del.next;
			if (del == null) {
				System.out.println("data not found in list");
				return false;
			}
		}

		prev.setNext(del.getNext());
		return true;

	}

	// delete by position
	public void deleteByPos(int position) {
		if (position == 1) {
			head = head.next;
			return;
		}
		if (head == null && position < 0) {
			System.out.println("Empty list");
		}

		Node del = head;
		Node prev = head;
		for (int i = 1; i < position; i++) {
			prev = del;
			del = del.next;
			if (del == null) {
				System.out.println("position not valid");
				return;
			}
		}
		prev.setNext(del.getNext());
	}

	// search max element
	public void getMax() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		if (head.next == null) {
			System.out.println("Max ele: " + head.data);
		}

		Node temp = head;
		Node max = head;
		while (temp != null) {
			if (temp.data > max.data) {
				max = temp;
			}
			temp = temp.next;
		}

		System.out.println("Max ele : " + max.data);

	}

	// get minimum element
	public void getMin() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		if (head.next == null) {
			System.out.println("Min ele : " + head.data);
			return;
		}

		Node temp = head;
		Node min = head;
		while (temp != null) {
			if (temp.data < min.data)
				min = temp;
			temp = temp.next;
		}
		System.out.println("Min ele : " + min.data);
	}

	// display
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// ascending order
	public void ascending() {
		if (head == null) {
			System.out.println("No element");
			return;
		}
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		Node temp = head;
		Node curr = head;
		while(temp!=null) {
			while(curr!=null) {
				if (curr.data < temp.data) {
					int s = curr.data;
					curr.data = temp.data;
					temp.data = s;
				}
				curr = curr.next;
			}
			temp = temp.next;
			curr = temp;
			
		}
		display();
	}
}
