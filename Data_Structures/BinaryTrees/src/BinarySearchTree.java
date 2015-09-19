/*
 * This class will describe all the operations of a BST.
 * */
public class BinarySearchTree {
	public Node root;
	
	public BinarySearchTree insert(int value){
		Node node = new Node<> (value);
		
		if(root == null){
			root = node;
			return this;
		}
		
		insertNode(root,node);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public void insertNode(Node latestRoot, Node node){
		
		if(latestRoot.value > node.value){
			// If there is no left node 
			if(latestRoot.left == null){
				latestRoot.left = node;
				return;
			}// If left node present, check run method again recursively.
			else {
				insertNode(latestRoot.left,node);
			}
			
		}
		else {// If node is greater than root 
			// If there is no right node
			if(latestRoot.right == null){
				latestRoot.right = node;
				return;
			}// If present, recursively check value and then insert
			else {
				insertNode(latestRoot.right,node);
			}
		}
	}
	
	@SuppressWarnings("null")
	public int BSTMinimum(){
		if(root == null){
			return 0;
		}
		
		Node currentRoot = root;
		while(currentRoot.left != null){
			currentRoot = currentRoot.left;
		}
		return currentRoot.value;
		
	}
	
	public int BSTMaximum(){
		if(root == null){
			return 0;
		}
		Node currentRoot = root;
		while(currentRoot.right != null){
			currentRoot = currentRoot.right;
		}
		return currentRoot.value;
	}
	
	

}
