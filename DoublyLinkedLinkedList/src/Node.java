// Creating Node class with Generics 
public class Node<T> {
	Node prev;
	Node next;
	T data;
	
	public Node(T data){
		this.data = data;
		prev = null;
		next = null;
	}
}
