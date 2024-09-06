package basicJava;

import java.util.ArrayList;
import java.util.List;

/**
 * MissingList
 */
public class MissingList {

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findMissingNumber(arr));

    }
    private static  List<Integer> findMissingNumber(int[] arr){
        List<Integer> missingNum=new ArrayList<Integer>();
        missingNum.size();
        
        //sort the array using the cyclic sort
        int i=0;
        while (i<arr.length) {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i , correctIndex);
            }
            else{
                i++;
            }
        }

        //traverse the array and check whether the sorted array element is in their postion or not and if not
        //add this index to the list
        for (int index = 0; index< arr.length; index++) {
            if(arr[index]!=index+1){
            missingNum.add(index+1);
            }
        }

        return missingNum;
    }

    private static void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}