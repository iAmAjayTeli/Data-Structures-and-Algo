package basicJava;

import java.util.Arrays;

public class FirstAndLastPosition {
    
    public static void main(String[] args) {
        int[] arr= {1,3,4,5,5,5,5,8,9};
        int target= 5;
        int[] ans= searchPosition(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] searchPosition(int[] arr, int target){
        int[] ans={-1, -1};
        int start= search(arr, target, true);
        int end= search(arr, target, false);

        ans[0]= start;
        ans[1]=end;

        return ans;

      
    }

  static int search(int[] arr, int target, Boolean isSearchLeft){
        int ans=-1;

        int start= 0;
        int end= arr.length-1;

        while (start<=end) {
            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end= mid-1;
            }
            else if (target>arr[mid]) {
                start= mid+1;
                
            }
            else{
                ans=mid;
                if(isSearchLeft){
                    end= mid-1;
                }
                else{
                    start= mid+1;
                }
            }
            
        }
        return ans;
    }
}
