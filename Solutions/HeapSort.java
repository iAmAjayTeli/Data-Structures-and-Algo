package Solutions;

import java.util.Arrays;;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr={4, 10, 3, 5, 1};
        int n=5;
        heapSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    private static void heapSort(int[] arr,int n){
        buildHeap(arr,n);
        for(int i=n-1; i>=1; i--){
            swap(arr,0, i);
            maxHeapify(arr, i, 0);
        }
    }

    private static void buildHeap(int[] arr, int n){
        for(int i=(n-2)/2; i>=0; i--){
            maxHeapify(arr, n, i);
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    private static void maxHeapify(int[] arr, int n, int i){
        int largest= i;
        int left= 2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest= left;
        }
        else if (right<n && arr[right]>arr[largest]) {
            largest=right;
        }

        if(largest!=i){
            swap(arr, largest, i);
            maxHeapify(arr, n, largest);
        }
    }
}
