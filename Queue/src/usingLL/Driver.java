package usingLL;

public class Driver {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		
		System.out.println(q.add(10));
		System.out.println(q.add(20));
		System.out.println(q.add(30));
		System.out.println(q.add(40));
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.remove());

	}

}
