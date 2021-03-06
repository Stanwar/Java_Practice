// Creating Node class with Generics 
public class Node<T> {
	Node<T> prev;
	Node<T> next;
	T data;
	
	public Node(){
		data = null;
		prev = null;
		next = null;
	}
	//
	public Node(T data){
		this.data = data;
		prev = null;
		next = null;
	}
	//
	public Node(T data, Node<T> prev, Node<T> next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	//
	public T getData(){
		return data;
	}
	// 
	public void setData(T data){
		this.data = data;
	}
	//
	public void setNextNode(Node<T> next){
		this.next = next;
	}
	//
	public Node<T> getNextNode(){
		return next;
	}
	//
	public void setPrevNode(Node<T> previous){
		this.prev = previous;
	}
	//
	public Node<T> getPrevNode(){
		return prev;
	}
}
