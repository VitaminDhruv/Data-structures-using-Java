import Graph.GraphNode;
import java.util.ArrayList;
import java.util.Stack;
public class TolologicalSorting {
	
	public ArrayList<GraphNode> nodes=new ArrayList<GraphNode>();


	public TolologicalSorting(ArrayList<GraphNode> nodes) {
		// TODO Auto-generated constructor stub
		this.nodes=nodes;
	}
	
	//Tolological Sort
	
	void toplological() {
		Stack<GraphNode> stack=new Stack();
		for(GraphNode node:nodes) {
			
			if(!node.isVisited()){
				topologicalVisit(node,stack);
			}
			else {
				stack.push(node);
			}
			
		}
	}
	
	private void topologicalVisit(GraphNode node,Stack<GraphNode> stack) {
		// TODO Auto-generated method stub
		
		GraphNode currentNode=node;
		//		ArrayList<GraphNode> neighbors=new ArrayList();
		for(GraphNode neighbors:currentNode.getNodeList()) 
			{
				if(!currentNode.isVisited()) {
					topologicalVisit(currentNode,stack);
				}
			}
		currentNode.setVisited(true);
		stack.push(currentNode);
	
	}
	
	
	public void addDirection(int i,int j) {
		GraphNode first=nodes.get(i-1);
		GraphNode second=nodes.get(j-1);
		first.getNodeList().add(second);
		second.getNodeList().add(first);
	}

}
