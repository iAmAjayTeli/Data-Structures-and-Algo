package basicJava;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n= 6;
        System.out.println(findLeaders(n, arr));
    }

    static ArrayList<Integer> findLeaders(int n, int arr[]) {
       ArrayList<Integer> leaders=new ArrayList<>();

       int max=0;
       int lastIndex= n-1;

       for(int i=lastIndex; i>=0; i--){
        if(max<arr[i]){
            max= arr[i];
             leaders.add(arr[i]);
        }
       }

      Collections.reverse(leaders);
      
      return leaders;
    }


}
