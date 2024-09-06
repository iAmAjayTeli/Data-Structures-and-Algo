package basicJava;
import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 5};
       
        int[] ans= findIndex(arr, 5);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findIndex(int arr[], int key) {
        Arrays.sort(arr);
        int[] ans;
        int startingIndex=-1, endingIndex=-1;
        Boolean isStartFound= false, isEndFound=false;
        int j= arr.length-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key && !isStartFound){
                startingIndex=i;
                isStartFound=true;
                
            }
            
            if(arr[j]==key && !isEndFound){
                endingIndex=j;
                isEndFound=true;
               
            }

            j--;
           
        }
        
        ans=new int[]{startingIndex, endingIndex};
        
        return ans;
      }
}
