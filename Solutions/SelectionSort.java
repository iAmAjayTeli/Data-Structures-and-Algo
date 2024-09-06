package Solutions;
import java.util.Arrays;;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {3,4,6,1,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex=arr.length-1-i;
            int maxIndex= getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);

        }
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }

        return max;
    }

    private static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
