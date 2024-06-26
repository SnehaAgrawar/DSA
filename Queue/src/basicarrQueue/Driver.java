package basicarrQueue;

public class Driver {
	public static void main(String[] args) {
		
		Queue q1=new Queue();
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		
		q1.display();
		
		q1.remove();
		
		q1.display();
	}
}
