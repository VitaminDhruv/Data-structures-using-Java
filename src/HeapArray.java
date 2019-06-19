package Binary_Heap;

public class HeapArray {
	
	int[] heap;
	int treeSize;
	
	public HeapArray(int size) {
		// TODO Auto-generated constructor stub
		heap=new int[size+1];
		this.treeSize=0;
		System.out.println("The empty Heap has been created");
	}
	
	public int arrayLength() {
		// TODO Auto-generated method stub
		return this.heap.length;
	}
	
	public int treeSize() {
		// TODO Auto-generated method stub
		System.out.println("Size of tree is: "+treeSize);
		return treeSize;
	}
		
	public boolean isHeapEmpty() {
		// TODO Auto-generated method stub
		if(treeSize<0) {
			System.out.println("tree is empty");
			return true;
		}
		else {
			System.out.println("tree is not empty");
			return false;
		}
	}
	public void deleteHeap() {
		// TODO Auto-generated method stub
		heap=null;
		System.out.println("heap is now deleted");
	}

	
	public void insertHeap(int val) {
		// TODO Auto-generated method stub
		//Inserting at the last position of thr Heap(Array)
		System.out.println("Adding: "+val+" in the Heap..");
		heap[treeSize+1]=val;
		
		HappifyBottomTop(treeSize);
		System.out.println("Inserted: "+val+" succesfully in Heap!");
		levelOrder();
	}
	
	//Peek into the Heap
	public void peek() {
		if(treeSize==0) {
			System.out.println("The heap is empty");	
		}
		else {
			System.out.println("the Head of he heap is: "+heap[1]);
		}
	}
	
	//extract from the heap
	public int exctractHead() {
		// TODO Auto-generated method stub
		if (treeSize==0) {
			System.out.println("Heap is empty.");
			return -1;
		}
		else {
			System.out.println("The head of the heap is: "+heap[1]);
			int extVal=heap[1];
			heap[1]=heap[treeSize-1];
			treeSize--;
			HeapifyTopToBottom(1);
			System.out.println("Value extracted!");
			levelOrder();
			return extVal;
		}
	}
	
	
	
	
	
	

	private void HeapifyTopToBottom(int index) {
		// TODO Auto-generated method stub
		//needed when we extract a value from the heap
		//Make the last index value at head of the heap and call recursively
		int left=index*2;
		int right=(index*2)+1;
		int smallestChild=0;
		
		if(treeSize<left) {
			return; // No child in the node
		}
		else if(treeSize==left) {
			if(heap[index] > heap[left]) {
				int tmp = heap[index];
				heap[index] = heap[left];
				heap[left] = tmp;
			}
			return;
		}
		else {
			if(heap[left] < heap[right]) { //Find out the smallest child
				smallestChild = left;
			}else {
				smallestChild = right;
			}
			if(heap[index] > heap[smallestChild]) { //If Parent is greater than smallest child, then swap
				int tmp = heap[index];
				heap[index] = heap[smallestChild];
				heap[smallestChild] = tmp;
			}
		}
		HeapifyTopToBottom(smallestChild);
		
		
		
	}

	private void levelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Printing all the elements of the heap");
		for (int i = 0; i < heap.length; i++) {
			System.out.println(heap[i]+" " );
		}
	}
	

	public void HappifyBottomTop(int index) {
		// TODO Auto-generated method stub
		int parent=index/2;
		
		if(parent<=1) {
			//We are the head
			return;
		}

		if( heap[index]<heap[parent] ) {
			int temp=heap[index];
			heap[index]=heap[parent];
			heap[parent]=temp;
			
		}
		HappifyBottomTop(parent);
		
	}
	
	
	
	
}
