
public class BSTRun {
	public static void main(String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(45);
		bst.insert(55);
	
		
		System.out.println("Maximum of BST : " + bst.BSTMaximum());
		System.out.println("Maximum of BST : " + bst.BSTMinimum());
	}
}
