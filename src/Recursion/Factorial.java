package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Factorial {
	
	
	//finding factorial using recursive problems
	
	private static int findFactorial(int x) {
		// TODO Auto-generated method stub
		// Result is the current number * current-1
		//recursion
		/*
		if(x>1) {
		
		return x*findFactorial(x-1);		
		}
		else {
			return 1;
			}
		*/
		
		//without recursion
		int result=1;
		while(x>1) 
		{
			result*=x;
			x--;
		}
		return result;
	
	}
	
	//fibbonacci series
	
	private static void fibbonacci(int len) 
	{
		// TODO Auto-generated method stub
		
		
		
		
		//you just seriously focused for 7 second and you got it, dude
		// 0,1,1,2,3,5,8
		int first=0;
		int second=1;
		while(!(len<0))
		{
			int sum=first+second;
			//sum+=current;
			System.out.println(first);
			first=second;
			second=sum;
			len--;
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//System.out.println("Factorial of 5: "+findFactorial(5));
		fibbonacci(5);
		int[] arr= {1,2,3,4,5,6};
		//System.out.println("  this is what "+get(arr,3));
		    }

}
