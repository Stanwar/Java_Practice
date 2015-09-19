// Creating Node Class for Implementing LinkedList 
public class Node {
	Node next;
	Object data;
	
	public Node(Object _data){
		next = null;
		data = _data;
	}
	
	// Multiple constructors when we need to give next reference too 
	public Node(Object _data, Node _next){
		next = _next;
		data = _data;
	}
	
	// Getter Method for Data in a node
	public Object getData(){
		return data;
	}
	
	// Setter Method for Data in a node
	public void setData(Object _data){
		data = _data;
	}
	
	// Getter Method for Next Reference of a node
	public Node getNext(){
		return next;
	}
	
	// Setter Method for Next Reference of a node
	public void setNext(Node _next){
		next = _next ;
	}
}
