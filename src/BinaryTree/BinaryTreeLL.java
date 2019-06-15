package BinaryTree;
import BinaryTree.Node;
import java.util.*;

public class BinaryTreeLL {
	
	//Root node of the tree
	Node rootNode;

	//Creating a blank binary tree
	
	public BinaryTreeLL() {
		// TODO Auto-generated constructor stub
		this.rootNode=null;
	}
	/*
	 * 1) Insert a node at Binary tree
	 * 2) Remove a node from binary tree
	 * */
	
	//1) Inserting a node in binary tree
	public void insert(int value) {
		// TODO Auto-generated method stub
	
		//create a node to insert with its value
		Node node=new Node();
		node.setValue(value);
	
		// if empty binary tree!
		if(rootNode==null) {
			rootNode=node;
			System.out.println("Node insterted at the RootNode");
			return;
		}
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(rootNode);
		
		while(!queue.isEmpty()) 
		{
			Node currentNode=queue.remove();
			
			if(currentNode.getLeft()==null) 
			{
				currentNode.setLeft(node);
				System.out.println("New node inserted");
				break;
			}
			else if(currentNode.getRight()==null) {
				currentNode.setRight(node);
				System.out.println("New node is inserted");
				break;
			}
			else {
				queue.add(currentNode.getLeft());
				queue.add(currentNode.getRight());
			}	
		}
	}
	
	
	//2) Deleting a node from the given tree
	
	public void deleteNode(int value) {
		// TODO Auto-generated method stub
		Queue<Node> queue=new LinkedList<Node>();
			
		queue.add(rootNode);
		
		while(!queue.isEmpty()) {
			Node currentNode=queue.remove();
			
			if(currentNode.getValue()==value) {
				currentNode.setValue(lastNode().getValue());
				DeleteLastNode();
				System.out.println("Delete the node!");
				return;
			}
			else {
				if(currentNode.getLeft()!=null) 
				{
					queue.add(currentNode.getLeft());
				}
				if(currentNode.getRight()!=null) {
					queue.add(currentNode.getRight());
				}
			}
			System.out.println("No node foud");
			
		}
	}
	
	
	
	//Deleting the last node
	private void DeleteLastNode() {
		// TODO Auto-generated method stub
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(rootNode);
		
		Node prvNode,crtNode=null;
		
		while(!queue.isEmpty()) 
		{
			prvNode=crtNode;
			crtNode=queue.remove();
			
			if(crtNode.getLeft()==null) {
				prvNode.setLeft(null);
			}
			else if(crtNode.getRight()==null) {
				prvNode.setRight(null);
			}
			
			queue.add(crtNode.getLeft());
			queue.add(crtNode.getRight());
		}
	}
	
	
	
	//Get the last node of the binary tree
		public Node lastNode() {
			
			Queue<Node> queue=new LinkedList<Node>();
			queue.add(rootNode);
			Node currentNode=null;
			
			while(!queue.isEmpty()) {
				currentNode=queue.remove();
				
				if(currentNode.getLeft()!=null) {
					queue.add(currentNode.getLeft());
				}
				if(currentNode.getRight()!=null) {
					queue.add(currentNode.getRight());
				}
					
			}
			return currentNode;
			}
		}
//Delete the deepest node

	
	
	
	
	
	

