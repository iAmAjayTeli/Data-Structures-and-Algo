package Solutions;

import java.util.Arrays;;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex= nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                return nums[index];
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
