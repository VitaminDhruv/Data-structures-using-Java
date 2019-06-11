package Array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		//rotation(arr, 2);
		//System.out.println(Arrays.toString(reverse(arr)));
		String[] names= {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(names));
	
	}
	
	
	public static void rotation(int nums[],int k) {
		// TODO Auto-generated method stub
		int[] temp=new int[nums.length];
		int len=nums.length-1;
		
		for (int i = 0; i <= len; i++)
		{
			
		}
		
		
	}
	
	public static int[] reverse(int[] num) 
	{
		int temp=0;
		int len=num.length;
		for (int i = 0; i < len/2; i++) {
			temp=num[i];
			num[i]=num[len-i-1];
			num[len-i-1]=temp;
		}
		return num;
	}
	
	/*
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}
		*/
		
		
	public static String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) return "";
	    for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i);
	        for (int j = 1; j < strs.length; j ++) {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	                return strs[0].substring(0, i);             
	        }
	    }
	    return strs[0];
	}
	
	
	
	
}

