package usingLL;

public class Queue {

//	private int size;
//	private int arr[];
//	private int front;
//	private int rear;

//	
//	public Queue(int size) {
//		this.size = size;
//		this.rear=-1;
//		this.front=-1;
//		arr = new int[size];
//	}

	static Node head = null;
	static Node tail = null;

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	//add data into Queue
	public boolean add(int data) {
		Node newNode = new Node(data);

		if (head==null) {
			head = tail = newNode;
			return true;
		}

		tail = tail.getNext();
		tail = newNode;
		return true;
	}
	
	//Delete data from Queue
	public int remove() {
		//check if Queue is empty
		if(isEmpty())
			return -999;
		
		int front = head.getData();
		//for single node
		if(head.getNext()==null) {
			head=tail=null;
		}else {
			head = head.getNext();
		}
		
		return front;
		
	}

}
