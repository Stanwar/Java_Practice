
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
			System.out.println(temp.getNextNode().getData());
			temp = temp.getNextNode();
		}
	}
	// Traversal from tail
	public void traverseBack(){
		Node<T> temp = tail;
		while(temp.getPrevNode() != null){
			System.out.println(temp.getPrevNode().getData());
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
	// inserting new node at a given index  
	public void insertNodeAtIndex(T data,int index){
		// If there is no node present
		if(index <=0){
			insertNodeFront(data);
		}
		else if (index > getSize() || index == getSize()){
			insertNodeBack(data);
		}
		else {
			Node<T> temp = head;
			Node<T> newNode = new Node<T>(data);
			
			for(int i = 1 ; i< index;i++){
				temp = temp.getNextNode();
			}

			temp.getNextNode().setPrevNode(newNode);
			newNode.setNextNode(temp.getNextNode());
			newNode.setPrevNode(temp);
			temp.setNextNode(newNode);
		}
	}
	// Remove node for the specified index
	public T remove(int index){
		T data = null;
		
		if (index == 1){
			data = head.getData();
			head = head.getNextNode();
			return data;
		}
		else if( index == getSize()){
			data = tail.getData();
			tail = tail.getPrevNode();
			return data;
		}
		else {
			Node<T> temp = head;
			for( int i = 1; i<= index;i++){
				temp = temp.getNextNode();
			}
			
			temp.getPrevNode().setNextNode(temp.getNextNode());
			temp.getNextNode().setPrevNode(temp.getPrevNode());
			temp = null;
			
		}

		return data;
	}
}
