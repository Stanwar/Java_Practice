
public class LinkedList<T> {
	public Node<T> head;
	public Node<T> tail;
	public int count;
	
	public LinkedList(){
		head = null;
		tail = null;
		count = 0;
	}
	// Getting size of the linked list
	public int getSize(){
		
		Node<T> temp = head;
		
		if(head == null){
			return count;
		}
		else{
			while(temp.getNextNode() != null){
				temp = temp.getNextNode();
				count++;
			}
		}
		return count;
	}
	// Traversal from head
	public void traverseForward(){
		Node<T> temp = head;
		while(temp.getNextNode() != null){
			System.out.println(temp.getNextNode());
			temp = temp.getNextNode();
		}
	}
	// Traversal from tail
	public void traverseBack(){
		Node<T> temp = tail;
		while(temp.getPrevNode() != null){
			System.out.println(temp.getPrevNode());
			temp = temp.getPrevNode();
		}
	}
	// Inserting in beginning of the Linked List
	public void insertNodeFront(T data){
		Node<T> newHeadNode = new Node<T>(data);
		if( head == null){
			head = newHeadNode;
			tail = newHeadNode;
			newHeadNode.setNextNode(null);
			newHeadNode.setPrevNode(null);
		}
		else{
			newHeadNode.setNextNode(head);
			head.setPrevNode(newHeadNode);
			head = newHeadNode;
		}
		
	}
	// Inserting at the end of the linked list
	public void insertNodeBack(T data){
		Node<T> newTailNode = new Node<T>(data);
		if(tail == null){
			tail = newTailNode;
			head = newTailNode;
			newTailNode.setNextNode(null);
			newTailNode.setPrevNode(null);
		}
		else{
			newTailNode.setPrevNode(tail);
			tail.setNextNode(newTailNode);
			tail = newTailNode;
		}
	}
	// 
	public void insertNodeAtIndex(){
		
	}
}
