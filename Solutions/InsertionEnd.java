package Solutions;

import java.util.Arrays;;

public class InsertionEnd {
    public static void main(String[] args) {
        int capacity=20;
        int[] arr=new int[capacity];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
       int n= insertEnd(arr,8);
       for (int i = 0; i < n; i++) {
        System.err.println(arr[i]+" ");
       }
        System.out.println(Arrays.toString(arr));
    }

    private static int insertEnd(int[] arr, int ele){
        int n= 6;

        arr[n]=ele;
        return n+1;
    }
}
