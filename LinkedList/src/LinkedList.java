
public class LinkedList {
	private Node head;
	private int listCount; // Keeping track of the length of the list. 
	
	// Constructor for linked list initializing the head and the list count 
	public LinkedList(){
		head = new Node(null);
		listCount = 0 ;
	}
	
	// Function to add at the end of the Tail
	public void add(Object data){
		Node temporary = new Node(data);
		Node current = head;
		
		while(current.getNext() != null){
			current = current.getNext();
		}
		// Setting Temporary to be head
		current.setNext(temporary);
		// Incrementing List Count
		listCount++;
		
	}
	
	// Function to add at a specified index
	public void add(Object data, int index){
		Node temporary = new Node(data);
		Node current = head;
		
		for(int i=1; i< index && current.getNext() != null; i++){
			current = current.getNext();
		}
		temporary.setNext(current.getNext());
		current.setNext(temporary);
		listCount++;
	}
	
	public Object get(int index){
		if (index <= 0){
			return false;
		}
		
		Node current = head.getNext();
		
		for (int i = 1; i<index; i++){
			if (current.getNext() == null){
				return null;
			}
			current = current.getNext();
		}
		return current.getData();
	}
	public boolean remove (int index){
		if (index < 1 || index > size()){
			return false;
		}
		
		Node current = head;
		
		for (int i = 1; i<index && current.getNext() !=null; i++){
			current = current.getNext();
		}
		
		current.setNext(current.getNext().getNext());
		return true;
	}
	public int size(){
		return listCount;
	}
}
