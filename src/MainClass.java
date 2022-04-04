import singlylinkedlist.SinglyLinkedList;

public class MainClass {
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.addFront(2);
		list.addFront(8);
		list.addFront(7);
		list.addFront(10); // O(1)
		list.addBack(10202); // O(n)
		
		list.printAll();
		System.out.println(list.getSize()); // Size
		list.deleteValue(7);
		System.out.println("\n");
		list.printAll();
		System.out.println(list.getSize()); // Size
//		System.out.println(list.getFirst()); // O(1)
//		System.out.println(list.getLast()); // O(n)
//		System.out.println(list.getSize()); // Size
//		list.clear();
//		System.out.println(list.getFirst()); // O(1)
//		System.out.println(list.getLast());
		
		
	}

}
