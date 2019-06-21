import java.util.Arrays;

public class BubbleSort {

	private static int[] bubbleSort(int Arr[]) {
		for (int i = 0; i < Arr.length-1; i++) {
			for (int j = 0; j < Arr.length-1; j++) {
				
				if(Arr[j]>Arr[j+1]) {
					
					int temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
				}
			}
		}
		return Arr;
		
	}
	public static void main(String[] args) {
		int[] arr={8,9,5,2,3,1,10};
		System.out.println(" "+Arrays.toString(bubbleSort(arr)));
	
	}
 	
}