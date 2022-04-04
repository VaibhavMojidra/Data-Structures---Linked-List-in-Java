package singlylinkedlist;

public class SinglyLinkedList {
	private Node head;
	private int size=0;
	public void addFront(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			size++;
			head=newNode;
			return;
		}
		//Setting newNode's next to head that is first node 
		newNode.next=head;
		
		//making newNode as first/head
		head=newNode; // O(1)
		size++;
	}
	
	public int getFirst() {
		if(head==null) {
			System.out.println("No data found in linked list");
			return -111111111;
		}else {
			return head.data; // O(1)
		}
	}
	
	public int getLast() {
		if(head==null) {
			System.out.println("No data found in linked list");
			return -111111111;
		}else {
			Node current=head;
			while(current.next!=null) { // O(n)
				current=current.next;
			}
			return current.data;
		}
	}
	
	public void addBack(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null) { // O(n)
			current=current.next;
		}
		current.next=newNode;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void clear() { //O(1)
		size=0;
		head=null;
		System.gc();
	}
	
	public void deleteValue(int value) {
		if(head!=null) {
			Node current=head;
			while(current.next!=null) { // O(n)
				if(current.next.data==value) {
					current.next=current.next.next;
					size--;
					return;
				}
				current=current.next;
			}
			System.out.print("No Value found");
		}else {
			System.out.print("No data in list");
		}
	}
	
	public void printAll() {
		if(head!=null) {
			Node current=head;
			System.out.print(" "+head.data);
			while(current.next!=null) { // O(n)
				current=current.next;
				System.out.print(" "+current.data);
			}
		}else {
			System.out.print("No data in list");
		}
		System.out.print("\n");
	}
}
