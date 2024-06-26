package basicarrQueue;

public class Queue {
	int rear;
	int front;
	int arr[];
	int size;
	public Queue() {
		super();
		this.rear = -1;
		this.front = -1;
		this.size = 5;
		this.arr = new int [size];
		
	}
	
	public boolean isEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}return false;
	}
	public boolean isFull() {
		if(front==-1 && rear==size-1) {
			return true;
		}
		return false;
	}
	public void insert(int data) {
		if(isFull()) {
			System.out.println("invalid");
			return;
		}
		arr[++rear]=data;
		front = 0;
		System.out.println("added : "+data);
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("no ele");
			return;
		}
		int del = arr[front++];
		System.out.println("deleted : "+del);
		
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("-999");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
				
	}
	
}
