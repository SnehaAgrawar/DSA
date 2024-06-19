package doublestack;

public class Driver {
	public static void main(String[] args) {
		DoubleStack s = new DoubleStack(5);

		System.out.println(s.push1(50));
//		s.push1(40);
//		s.push2(30);
//		s.push1(20);
//		s.push2(10);

		//System.out.println(s.pop1());
		System.out.println(s.isEmpty1());
		System.out.println(s.isFull());
		
	}
}
