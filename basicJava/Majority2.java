package basicJava;

import java.util.Arrays;;

public class Majority2 {
    public static void main(String[] args) {
        int[] arr = { 2, 13 };
        System.out.println(majority(arr));
    }

    private static int majority(int[] arr) {
       int candidate= findCandidate(arr);
       boolean isMajorityElement= isMajority(arr, candidate);

       if(isMajorityElement){
        return candidate;
       }

       return -1;
    }

    private static int findCandidate(int[] arr){

        int candidate= arr[0];
        int count=1;

        for(int i=1; i<arr.length; i++){
            if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                candidate=arr[i];
                count=1;
            }
        }

        return candidate;
    }

    private static Boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        int majoritySize = arr.length / 2;

        for (int ele : arr) {
            if (ele == candidate) {
                count++;
            }
        }

        return count>majoritySize;
    }
}