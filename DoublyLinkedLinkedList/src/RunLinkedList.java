
public class RunLinkedList {
	public static void main(String[] args){
		LinkedList< Integer > list = new LinkedList<Integer>();
		list.insertNodeFront(50);
		list.insertNodeFront(45);
		list.insertNodeFront(40);
		list.traverseForward();
		list.traverseBack();
		System.out.println("the size of the linkedlist is : " + list.getSize());
	}
}
