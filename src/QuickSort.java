

public class QuickSort {
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = quickSorting(array, start, end);
			quickSort(array, start, pivot-1 );
			quickSort(array, pivot + 1,end);
		}
	}//
	
	
	public static int quickSorting(int Arr[],int start,int pivot) {

		int p=pivot;
		int i=start-1;
		for(int j=start;j<=pivot;j++) {
			
			
			if(Arr[j]<=Arr[p]) {
				i++;
				int temp=Arr[i];
				Arr[i]=Arr[j];
				Arr[j]=temp;
				
			}
			
		}
		return i;
		
	}
	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {9,4,6,3,7,1,2,11,5};
quickSort(arr, 0, arr.length-1);
QuickSort.printArray(arr);

	}
			
}

	
