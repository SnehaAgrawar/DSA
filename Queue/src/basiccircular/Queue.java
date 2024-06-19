package basiccircular;

public class Queue {
	private int count;
	private int size;
	private int arr[];
	private int rear;
	private int front;

	public Queue(int size) {
		this.size = size;
		this.rear = -1;
		this.front = -1;
		this.count = 0;
		arr = new int[size];
	}

	public boolean isEmpty() {
		if ((front == -1 && rear == -1) || front == rear)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if((front==-1 && rear==(size-1))||(rear+1)%size==front)
			return true;
		return false;
	}
	
	
	public boolean insert(int data) {
		if(isFull())
			return false;
		rear = (rear+1)%size;
		arr[rear] = data;
		return true;
	}
	
	public int delete() {
		if(isEmpty())
			return -999;
		front = (front+1)%size;
		return arr[front];
	}
	

}
