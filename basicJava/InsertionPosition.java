package basicJava;

import java.util.Arrays;;

public class InsertionPosition {
    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int size = 5;
        int num = 10, pos = 2;

        System.out.println("Before inserting elements:"+Arrays.toString(arr));

        for(int i=size-1; i>=pos; i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=num;

        System.out.println("After inserting elements:"+Arrays.toString(arr));
    }
}
