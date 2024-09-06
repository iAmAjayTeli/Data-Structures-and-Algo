package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleShortPractice {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void rearrangeArray(int[] arr) {
        int size= arr.length;
        for (int i = 0; i < size - 1 - i; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for(int i=0; i<size-1; i++){
            for(int j= size-1; j>=1; j--){
                arr[i]=arr[i];
                arr[i+1]=arr[j];
            }
        }


        List<Integer> ans= new ArrayList<Integer>();

       ans.add(1, 2);
      System.out.println(true);


      

    }
}
