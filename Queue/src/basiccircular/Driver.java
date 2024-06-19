package basiccircular;

import basiccircular.Queue;

public class Driver {
	public static void main(String[] args) {
		Queue cq = new Queue(5);
		System.out.println(cq.insert(10));
		System.out.println(cq.insert(20));
		System.out.println(cq.insert(30));
		System.out.println(cq.insert(40));
		System.out.println(cq.insert(50));
		
		
		System.out.println(cq.delete());
//		System.out.println(cq.delete());
//		System.out.println(cq.delete());
//		System.out.println(cq.delete());
		System.out.println(cq.delete());
		System.out.println(cq.insert(60));
		System.out.println(cq.insert(70));
	}
		
}
