package simplestack;

public class Driver {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		
		System.out.println(s.push(50));
		s.push(40);
		s.push(30);
		s.push(20);
		s.push(10);
		
		System.out.println(s.pop());
		
		s.peek();
		

	}

}
