package circular;

public class CircularQueue {
	
	private int count;
	private int size;
	private int arr[];
	private int rear;
	private int front;
	
	public CircularQueue(int size) {
		this.size = size;
		this.rear=-1;
		this.front=-1;
		this.count=0;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		else {
			count--;
			return false;
		}
	}
	
	public boolean isFull() {
		if(count==size) {
			return true;
		}
		else {
			count++;
			return false;
		}
		
	}
	
	
	public boolean insert(int data) {
		if(isFull())
			return false;
		rear = (rear+1)%size;
		arr[rear]=data;
		return true;
	}
	
	
	public int delete() {
		if(isEmpty())
			return -999;
		front = (front+1)%size;
		return arr[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return;
		}
		while(front!=rear) {
			System.out.print(arr[front]+" ");
			front = front+1;
		}
		
	}
	
}
