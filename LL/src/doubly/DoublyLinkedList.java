package doubly;

public class DoublyLinkedList {
	Node head;

	public DoublyLinkedList() {
		this.head = null;
	}

	// Insert at last
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			System.out.println("Added : " + head.getData());
			return;
		}

		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		newNode.setPrev(temp);
		System.out.println("Added : " + newNode.getData());
	}

	// Insert at first
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			System.out.println("Added : " + newNode.getData());
			return;
		}

		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		System.out.println("Added : " + newNode.getData());
	}

	// Insert by position
	public void insert(int data, int pos) {
		Node newNode = new Node(data);
		if (pos == 1) {
			newNode.setNext(head);
			if (head != null) {
				head.setPrev(newNode);
			}
			head = newNode;
			System.out.println("Added : " + newNode.getData());
			return;
		}

		if (head == null && pos > 1) {
			System.out.println("Empty list");
			return;
		}

		Node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.getNext();
			if (temp == null) {
				System.out.println("Position not valid");
				return;
			}
		}

		newNode.setNext(temp.getNext());
		if (temp.getNext() != null) {
			temp.getNext().setPrev(newNode);
		}
		temp.setNext(newNode);
		newNode.setPrev(temp);
		System.out.println("Added : " + newNode.getData());
	}

	// Delete last element
	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is empty. Nothing to delete.");
			return;
		}

		if (head.getNext() == null) {
			System.out.println("Deleted: " + head.getData());
			head = null;
			return;
		}

		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		System.out.println("Deleted: " + temp.getData());
		temp.getPrev().setNext(null);
	}

	// Delete first element
	public void deleteFirst() {
		if (head == null) {
			System.out.println("The list is empty. Nothing to delete.");
			return;
		}

		System.out.println("Deleted: " + head.getData());
		head = head.getNext();
		if (head != null) {
			head.setPrev(null);
		}
	}

	// delete by value
	public boolean delete(int data) {
		if (head == null) {
			System.out.println("Empty list");
		}

		if (head.data == data) {
			head = head.next;
			return true;
		}

		Node temp = head;
		while (temp.data != data) {
			temp = temp.next;
			if (temp == null) {
				System.out.println("data not found");
				return false;
			}
		}

		// temp is last node
		if (temp.next == null) {
			temp.prev.setNext(null);
		} else {
			// temp is at middle
			temp.prev.setNext(temp.getNext());

			if (temp.next != null) {
				temp.next.setPrev(temp.prev);
			}
		}
		return true;
	}

	// Display list
	public void display() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// delete by position
	public boolean deleteByPos(int pos) {
		if (head == null) {
			System.out.println("No elements in list");
			return false;
		}

		if (head.next == null && pos > 1) {
			System.out.println("invalid position");
			return false;
		}

		if (pos == 1) {
			head = head.next;
			if (head != null) {
				head.setPrev(null);
			}
			System.out.println("Deleted");
			return true;
		}

		Node del = head;
		for (int i = 1; i < pos; i++) {
			del = del.next;
			if (del == null) {
				System.out.println("Position not valid");
				return false;
			}
		}

		if (del.next != null) {
			del.next.setPrev(del.prev);
		}

		if (del.prev != null) {
			del.prev.setNext(del.next);
		}

		System.out.println("Deleted");
		return true;

	}

}
