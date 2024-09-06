package Solutions;

import java.util.ArrayList;
import java.util.List;

public class ListOfMissing {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex] && nums[i]<nums.length+1){
                swap(nums, i, correctIndex);
            }
        }

        int index=0;
        while(index<nums.length){
            if(nums[index]!=index){
                missing.add(index);
            }
            else{
                index++;
            }
        }
    return missing;
    }

    private static void swap(int[] arr , int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
