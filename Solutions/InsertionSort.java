package Solutions;
import java.util.Arrays;;

/**
 * insertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr= {2,6,8,1,5};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortInsertion(int[] arr){
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
             temp= arr[i];
             j=i;

             while (j>0 && temp<arr[j-1]) {
                arr[j]=arr[j-1];
                j--;
             }

             arr[j]=temp;

        }
    }
}