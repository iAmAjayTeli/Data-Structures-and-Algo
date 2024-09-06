package Solutions;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(findEqualibriumIndex3(arr));
    }

    // Native approach
    // time complexity--O(n2)
    private static int findEqualibriumIndex(int[] arr) {
        int size = arr.length;
        long leftSum, rightSum;

        for (int i = 0; i < size; i++) {

            // for left sum--it will go until the i because we have to sum the element of
            // left where the i is pointing
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // for right sum--it will go until the last index because we have to sum all the
            // element on right side of i that is why we also have increment j by 1.
            rightSum = 0;
            for (int j = i + 1; j < size; j++) {
                rightSum += arr[j];
            }

            // if left sum is equal to the right sum then return the index
            if (leftSum == rightSum) {
                return i + 1;
            }
        }

        return -1;
    }

    // [Better Approach] Using Prefix and Suffix Sum Array – O(N) Time and O(N)
    // Space:
    private static int findEqualibriumIndex2(int[] arr) {
        int size = arr.length;

        long[] leftSum = new long[size];
        long[] rightSum = new long[size];

        // initlialize
        leftSum[0] = arr[0];
        rightSum[size - 1] = arr[size - 1];

        for (int i = 1; i < size; i++) {
            leftSum[i] = arr[i] + leftSum[i - 1];
        }

        for (int i = size - 2; i >= 0; i--) {
            rightSum[i] = arr[i] + rightSum[i + 1];
        }

        System.out.print(Arrays.toString(leftSum) + " " + "\n" + Arrays.toString(rightSum) + " ");

        for (int i = 0; i < size; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i + 1;
            }
        }

       
        return -1;
    }

    //Excepted best approach as it don't require any extra space 
    //time complexity--O(n)
    //space complexity--O(1)

    private static int findEqualibriumIndex3(int[] arr){
        int sumRight=0;
        int sumLeft=0;
        int size= arr.length;

        for(int i=1; i<size; i++){
            sumRight+= arr[i];
        }

        for(int i=0; i<size-1; i++){
            if(size<=1){
                return 1;
            }

            if(sumLeft==sumRight){
                return i+1;
            }

            sumLeft+= arr[i];
            sumRight-=arr[i+1];
        }

        return -1;
    }
}
