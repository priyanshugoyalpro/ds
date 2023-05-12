package ram.ds.main.linkedlist;

public class MyLinkedList<T> {

	int size;
	Node head;

	public MyLinkedList() {
		size = 0;
		head = null;

	}
	
	public void add(T value)
	{
		Node newNode = new Node(value, null);
		if(head==null)
		{
		head=newNode;
		}
		
		
	}
	

	public class Node<T> {
		T data;
		Node<T> next;

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
