import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSorting(int[] Arr) {
	
		for (int i = 1; i < Arr.length; i++) {
			int current=Arr[i],j=i;
		
			while((j>0) &&(Arr[j-1]>current)  ) {
				Arr[j]=Arr[j-1];
				j--;			
			}
			Arr[j]=current;
		}
		return Arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {8,5,2,10,15,68,2,1,0,3,4};
		System.out.println(""+Arrays.toString(insertionSorting(arr)));

	
	}

}
