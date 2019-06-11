package Recursion;

public class BinarySearch {
	
	private static int binarySearching(int target,int[] arr,int start,int end) 
	{	// TODO Auto-generated method stub
		//Base condition
		if(start==end) 
		{
			if(arr[start]==target) {
				return target;
			}
			else {
				return 0;
			}
		}
		//Choosing the mid point
		int mid=(start+end)/2;
		
		if (arr[mid]>target) {
			return binarySearching(target, arr, start, mid);
		}
		
		else if (arr[mid]<target) {			
			return binarySearching(target, arr, mid, end);

		}
		
		else if(arr[mid]==target)
		{
			return mid;

		}
		return mid;
		
	}
	
	
	public static void main(String[] args) {
		int[] check= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The element is at the position: "+binarySearching(3, check, 1, check.length));
 	}
}
