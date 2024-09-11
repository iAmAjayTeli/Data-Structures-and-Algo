package Solutions;

import java.util.ArrayList;
import java.util.Arrays;;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,4,1,7,5};
        int n= arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
        
    }

    private static void mergeSort(int[] arr, int start, int end){
        if (start<end) {
            int mid= (start +end)/2;
             mergeSort(arr, start, mid);
             mergeSort(arr, mid+1, end);
             merge(arr, start, end, mid);
        }
    }

    private static void merge(int[] arr, int start, int end, int middle){
        ArrayList<Integer> temp= new ArrayList<>();
        int left= start;
        int right= middle+1;

        while (left<=middle && right<=end) {
           if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
           }
           else{
            temp.add(arr[right]);
            right++;
           }
        }

        while (left<=middle) {
            temp.add(arr[left]);
            left++;
        }

        while (right<=end) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=start; i<=end; i++){
            arr[i]=temp.get(i-start);
        }
    }
}
