package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	
	
	/*-------------Some practice examples and problems solution on Array*/
	
	
	
	
	//Removing the duplicates from the array 
	
	//Leetcode remove the duplicate Array example
	public static int[] removeDuplicate(int[] nums) {
		
		int position=1;
		
		for(int i=1;i<nums.length;i++) 
		{
			if(nums[i]!=nums[i-1]) {
				nums[position]=nums[i];
				System.out.println("Current Element: "+nums[position]);
				position++;

			}
			
			//System.out.println("Current Element: "+nums[i]);
			
		}
		
		
		return nums;
	}
	//Leetcode problem 122.
	public static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int profit=0;
		boolean Buy=true;
		//int difference=0;
		int currentStock=0;
		//int day=0;
		
		
		for(int i=0;i<prices.length-1;i++) 
		{
			// ready to buy! check for the next low
			if(Buy) 
			{
				if(prices[i]<prices[i+1]) 
				{
					currentStock=prices[i];
					System.out.println(" This stock is bought: "+prices[i]);
					Buy=false;

				}
			}
			//OK so now Stock is bought now its time to sell with the best profit
			if(Buy==false) 
			{// He gonna sold before the stock price goes down so no need to compare to other
				//elements of classs just to 
			//	System.out.println("In the loops");
				for(int j=i;j<prices.length-1;j++) 
				{
						if(prices[j]>prices[j+1]) 
						{
							System.out.println(" current stock sold for price "+prices[j]);
							profit+=prices[j]-currentStock;
							//stem.out.println("Current profit is: "+profit);
							i=j;
							Buy=true;
							break;
						}
						else if(i+2==prices.length) {
							System.out.println("Sold for: "+prices[prices.length-1]);
							profit+=prices[prices.length-1]-currentStock;
							Buy=true;
							break;
						}

				}
				
				
				
			}
			
			
		
		}
		return profit;
	}
	
	

	public static int maxProfit1(int[] prices) 
	//Dont think around the solutions ram , be creative think outside of the box..
	// Learn logic each time with new methods
	{//2,1,4,5,2,9,7
		// TODO Auto-generated method stub
		int result = 0;
        if (prices.length <= 1) {
            return 0;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i-1] > 0) {
                result += prices[i] - prices[i-1];
            }
        }
        return result;
		
	}
	
	
	
//leet code plusone-easy
	public static int[] plusOne(int[] digits) {
		// TODO Auto-generated method stub
		int temp=1;
		
		for(int i=digits.length-1;i>=0;i--) 
		{
			digits[i]+=temp;
			
			if(digits[i]>9) 
			{
				digits[i]=0;
				temp=1;
			}
			 
			
			else 
			{
				break;
			}
			
		}
		if(digits[0]==0) {
			digits=new int[digits.length+1];
			digits[0]=1;
		}
		
		
		
		
	
		return digits;
	}
	
	//Checking wheather this string is palindrom or not
	private static boolean isPalindrom(String name) {
		char[] temp=name.toCharArray();
		
		for (int i = 0; i < temp.length; i++) 
		{
			if(!(temp[i]==temp[temp.length-1-i])) 
			{
				System.out.println("Not palindrom");
				return false;
			}
		}
		
		System.out.println("Is palindrom");
		return true;
	}
	
	
	

	public static int searchInsert(int[] nums,int target) {
		// TODO Auto-generated method stub		
		for(int i=0;i<nums.length;i++)
		{
			if(target<=nums[i] ) 
			{	
				return i;
			}
			else if(target>nums[nums.length-1])
			{
				return nums.length;
			}
		}
		return 0;
	}
	
	private static int v(char c) {
		
		switch(c) {
			
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			}
			return 0;
		}
	
	public static int romanToInt(String s) 
	{
		
		// Is there any other way you can change  the loop or something!!! 
		//lets try it out
		int ans=0;
		
		for(int i=0;i<s.length();i++) {
			ans+=v(s.charAt(i));
		
		if(i>0 && (v(s.charAt(i))>v(s.charAt(i-1)))) 
		{
			ans-=2*v(s.charAt(i-1));
		}
		//return ans;
		}
		return ans;
	}
	
	
		
}

