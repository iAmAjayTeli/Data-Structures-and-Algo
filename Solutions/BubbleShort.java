package Solutions;

import java.util.Arrays;;

public class BubbleShort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        bubbleShort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleShort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }

            // if the elements are not swapped for particular value of i , then it should
            // not checked for others and break
            if (!isSwapped) {
                break;
            }
            
        }
    }
}
