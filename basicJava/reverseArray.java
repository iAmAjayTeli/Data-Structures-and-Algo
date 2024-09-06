package basicJava;

import java.util.Arrays;

/**
 * reverseArray
 */
public class reverseArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] array){
        int start=0;
        int end= array.length-1;
        while (end>start) {
            swap(array,start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] array, int index1, int index2){
      int temp= array[index1];
      array[index1]= array[index2];
      array[index2]=temp;
    }
}