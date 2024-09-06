package Solutions;

import java.util.ArrayList;

public class evenFinder {
    public static void main(String[] args) {
        int[] arr={3,4,2, 6,5,1};
       System.out.println(searchEven(arr).toString());

    }

    private static ArrayList<Integer> searchEven(int[] arr){
        ArrayList<Integer> evenNum= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
               evenNum.add(arr[i]);
            }
        }

        return evenNum;
    }
}
