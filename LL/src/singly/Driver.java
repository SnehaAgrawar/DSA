package singly;

public class Driver {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(10);
		l.insert(60);
		l.insert(9);
		l.insert(60);
		l.insert(100);
		l.insert(50);
		l.insert(60);
		l.display();
		l.getMax();
		l.getMin();

//		while (l.delete(60)) {
//			;
//		}
		l.display();
		
		l.ascending();

	}

}
