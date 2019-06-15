package BinaryTree;

public class Node {
	
	private int value;
	private Node left;
	private Node right;
	
	
	//Setter and getter method for node's value
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	//setter and getter method for right node
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	
	//Setter and getter for left node
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}

}
