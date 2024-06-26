package doubly;

public class Drivaer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList l = new DoublyLinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(60);
		
		l.display();
		
		l.deleteByPos(3);
		l.display();

	}

}
