package Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class search2DBS {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 4, 5 },
                { 6, 7, 8, 9 },
                { 10, 11, 12, 13}
        };

        int target = 9;

        ArrayList<Integer> ans = search(arr, target);
       System.out.println(ans);
    }

    private static ArrayList<Integer> search(int[][] arr, int target){
     ArrayList<Integer> ans= new ArrayList<>();

        int rowSize= arr.length;
        int columnSize= arr[0].length;

        for(int i=0; i<rowSize; i++){
            if(arr[i][0]<=target && target<=arr[i][columnSize-1]){
                int start=0;
                int end= columnSize-1;

                while (start<=end) {
                    int middle= start +(end-start)/2;

                    if(target>arr[i][middle]){
                        start= middle+1;
                    }
                    else if(target<arr[i][middle]){
                        end=middle-1;
                    }
                    else{
                      ans.add(i);
                      ans.add(middle);
                      return ans;
                    }
                }
            }
        }


        return ans;
    }
}
