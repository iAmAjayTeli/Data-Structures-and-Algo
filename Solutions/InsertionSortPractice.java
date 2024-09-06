package Solutions;
import java.util.Arrays;;
/**
 * InsertionSortPractice
 */
public class InsertionSortPractice {

    public static void main(String[] args) {
        int[] arr= {5,1,6,2,4,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr){
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            j=i;
            while (j>0 && temp<arr[j-1]) {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
    }
}