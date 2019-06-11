package Array;

import java.util.Arrays;

public class RemoveDuplicates {
	
	//Removing the duplicates elements from the Array
	//ALl unique number will be in the front side of array followed by other duplicates
	//My leetcode solution of problem remove Duplicates
	
		private static int[] removeDuplicates(int[] nums) {
			//0the index will not be change so we need to check the 1th position
			int position=1;
			for(int i = 1; i < nums.length-1; i++) 
			{
				if(nums[i]!=nums[i-1]) {
					nums[position]=nums[i];
					System.out.println("Current unique Element: "+nums[position]);
					position++;
				}
				
			}
			return nums;
		}
		
	public static void main(String[] args) {
		int[] temp= {1,1,2,2,2,3,5,5,6,7,9,9};
		System.out.println("result:"+Arrays.toString(removeDuplicates(temp)));
	}
	
	
}
