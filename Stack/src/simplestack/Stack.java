package simplestack;

public class Stack {
	int arr[];
	int top;
	int size;
	
	public Stack(int size) {
		this.size=size;
		this.top = -1;
		arr = new int[size];	
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top==(size-1);
	}
	
	
	public boolean push(int data) {
		if(isFull()) {
			return false;
		}
		
		arr[++top] = data;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -999;
		}
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty())
			return -999;
		return arr[top];
	}
	
//	public void display() {
//		for(int i=0; i< arr.length-1; i++){
//			System.out.print(arr[i]+ "  ");
//		}
//	}
//	
}
