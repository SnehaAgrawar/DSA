package tree;

public class Driver {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(70));
		System.out.println(bst.insert(30));
		System.out.println(bst.insert(10));
		System.out.println(bst.insert(55));
		System.out.println(bst.insert(80));
		System.out.println(bst.insert(90));
		System.out.println(bst.insert(40));

		bst.preOrder();
		System.out.println();
		bst.inOrder();
		bst.postOrder();
	}

}
