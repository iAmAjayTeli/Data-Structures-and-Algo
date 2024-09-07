package Solutions;

import java.util.Arrays;;

public class SelctionSortGFG {
    public static void main(String[] args) {
        int[] arr={4, 1, 3, 9, 7};
        int n=5;
        selectionSort(arr, n);
        System.out.println(Arrays.toString(arr));

    }

	static void selectionSort(int arr[], int n)
	{
	  for(int i=0; i<arr.length; i++){
	      int lastIndex= arr.length-1-i;
	      int maxIndex= getMaxIndex(arr, 0, lastIndex);
	      
	      
	      swap(arr, maxIndex, lastIndex);
	  }
	}
	
	private static int getMaxIndex(int[] arr, int start, int lastIndex){
	    int maxIndex=start;
	     for(int i=start; i<=lastIndex; i++){
	         if(arr[i]>arr[maxIndex]){
	             maxIndex=i;
	         }
	     }
	     
	     return maxIndex;
	}
	
	private static void swap(int[] arr, int first, int second){
	    int temp=arr[first];
	    arr[first]=arr[second];
	    arr[second]=temp;
	}
}
