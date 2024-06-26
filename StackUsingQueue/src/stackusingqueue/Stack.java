package stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	//will use two Queues to make stack
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	
	
	public boolean isEmpty() {
		return q1.isEmpty()&&q2.isEmpty();
		
	}
	
	public boolean push(int data) {
		if(q1.isEmpty()){
			q1.add(data);
		}else {
			q2.add(data);
		}
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -999;
		}
		
		int top = -1;
		
		//case 1
		if(!q1.isEmpty()) {
			while(!q1.isEmpty()) {
				top = q1.remove();
				if(q1.isEmpty())
					break;
			}
			q2.add(top);
		}
		
		//case 2
		else {
			while(!q2.isEmpty()) {
				top = q2.remove();
				if(q2.isEmpty())
					break;
			}
			q1.add(top);
		}
		
		return top;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
