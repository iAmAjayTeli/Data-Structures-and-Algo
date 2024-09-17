package Solutions;

import java.util.Arrays;

/**
 * SortInWave
 */
public class SortInWave {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 6, 3, 2, 20, 100, 80 };
        sortInWave(arr);
        System.out.println(Arrays.toString(arr));
    }

    //method 1--time complexity--O(nlogn)
    // private static void sortInWave(int[] arr) {
    //     Arrays.sort(arr);

    //     int nextPos = swap(arr, 0, 1);

    //     while (nextPos != -1) {
    //         nextPos = swap(arr, nextPos, nextPos + 1);
    //     }
    // }


    // private static int swap(int[] arr, int first, int second) {

    //     if (second >= arr.length) {
    //         return -1;
    //     }

    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;

    //     return second + 1;
    // }



    // //other method-2--time complexity--O(nlogn)
    // private static void sortInWave(int[] arr){
    //     Arrays.sort(arr);

    //     for(int i=0; i<arr.length-1; i+=2){
    //         swap(arr, i, i+1);
    //     }
    // }

    private static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    //other method -3--that do our job in single traversal
    //time complexity--O(n)
    private static void sortInWave(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i+=2){
            if(i>0 && arr[i-1]>arr[i]){
                swap(arr, i-1, i);
            }

            if(i<n-1 && arr[i+1]>arr[i]){
                swap(arr, i+1, i);
            }
        }
    }


}