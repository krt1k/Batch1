package llnew;

public class ll {
	private Node head;
	private Node tail;
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			tail = head = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	
	public void displayAll() {
		Node n = head;
		
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		
		System.out.print(n.data);
	}
	
	
}
