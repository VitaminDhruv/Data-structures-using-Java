package Queue;


public class Queue1 {
	

	private static int startPoint,endPoint,size;
	private static int[] queue;
	
	
	/* Creating a Single Array Queue and perfomring operation
	 * Creating a sinngle array queue
	 * inserting an element in quese
	 * delete an element from queuse
	 * peek()- operation on queue (return the first current element from queue)	  
	 */
	
	
	public Queue1(int size) {
		// TODO Auto-generated constructor stub
		startPoint=0;
		endPoint=0;
		this.size=size;
		queue=new int[this.size];
	}
	
	//Adding elements to the quese
	
	public static void AddEle(int data) 
	{
		//If the array (queue) is not full
		if(size!=endPoint) 
		{
			queue[endPoint]=data;
			System.out.println(" data: "+data+" has been added to the queue at position: "+endPoint);
			endPoint++;
		}
		//if the queuse is full no space to add an element
		else {
			System.out.println("Queue is full %!");
			
		}
	}
	
	//deleting an element from the queue
	
	public static void deQueue() {
		// TODO Auto-generated method stub
		/*deleting can be done two ways
		 * 1. we can delete the first element and shift the all element 
		 * which will result in O(n)
		 * 2. we can use circular queue where we if can del the element and
		 * shift the starting point and next if we want to add an element we will add to 
		 * the empty space and update the endPoint
		*/
		
		if(startPoint!=endPoint) 
		{
			System.out.println("data: "+queue[startPoint]+" at position: "+startPoint+" has been removed" );
			queue[startPoint]=0;
			startPoint++;
		}
		
		
		/*for shifting all the element
		 * 
		 *  for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
		 * 
		 */

	}
	
	public static void display() {
		// TODO Auto-generated method stub
		// displaying all elements of the queue
		
		for(int i=startPoint;i<endPoint;i++) {
			System.out.println("element "+queue[i]+" at:"+i);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int temp=10;
		Queue1 obj=new Queue1(10);

		for(int i=0;i<temp+2;i++)
		{
			//Adding 5 elemetns to the queuse
			obj.AddEle(i*10+1);
		}
		// Will result in error since the quese if full.
		//obj.AddEle(16);
		System.out.println("---");
		obj.deQueue();
		obj.deQueue();
		
		obj.display();
		

	}
	
	

}
