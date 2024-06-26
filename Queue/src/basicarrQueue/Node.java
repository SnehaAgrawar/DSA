package basicarrQueue;

public class Node {
	int rear;
	int front;
	int arr[];
	int data;
	int size;
	public Node( int data) {
		super();
		this.rear = -1;
		this.front = -1;
		this.arr = new int [size];
		this.data = data;
		this.size = size;
	}
	public int getRear() {
		return rear;
	}
	public void setRear(int rear) {
		this.rear = rear;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
}
