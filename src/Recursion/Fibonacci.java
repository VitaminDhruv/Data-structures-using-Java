package Recursion;

public class Fibonacci {
	//recursivly
	private static int fibonacci(int len)
	{
		if (len<1) {
			return 0;}
		
		if (len==1 || len==2){
			return len-1;}
		
		else 
		{
			return fibonacci(len-1)+fibonacci(len-2);
		}
		
	}
	
	// Non-recursivly
	/*private static int fibonacci(int len) 
	{
		//first two element gonna be 0 and 1
		int first=0;
		int second=1;
		
		if (len<1) {
			return 0;
		}
		if(len==1 || len==2) {
			return len-1;
		}
		
		while(len>1) 
		{
			int sum=first+second;
			first=second;
			second=sum;
			len--;
		}
		return first;
	}
	
	*/
	
	
	public static void main(String[] args) {
		//returns the input element of fibonacci series
		
		System.out.println("the fibonacci  element is "+fibonacci(5));
	}
}
