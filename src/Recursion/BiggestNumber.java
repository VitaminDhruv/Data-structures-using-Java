package Recursion;

public class BiggestNumber {
	//Static variable so the value of highest will be initially min_int and each recursive call can use the previous highest value 
	public static int highest=Integer.MIN_VALUE;
	
	private static int findBiggestNumber(int[] arr,int len) 
	{
		//If we have reached the positon -1 means we have iterate over an arrya from len-1 to 0 
		 if(len==-1) {
			 //return the current highest
			 return highest;
		 }
		 else {
			 //Updating the highest value each time
			 if(arr[len]>highest) 
			 {
				 highest=arr[len];
			 }
		//recursive call, reducing the len each time
		return findBiggestNumber(arr, len-1);
		 }
	
	
	}
	
	
	public static void main(String[] args) {
		int[] temp= {5,4,8,6,1,2,3,9,2,3,8};
		System.out.println("Largest element in the array: "+findBiggestNumber(temp, temp.length-1));
		}
}
