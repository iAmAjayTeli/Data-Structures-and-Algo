package Solutions;

public class CeilingNum {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,9};
        int target= 6;
        int ans= searchCeilingNum(arr, target);
        System.out.println(ans);
    }

    private static int searchCeilingNum(int[] arr, int target){
        int start= 0;
        int end= arr.length-1;

        while (start<=end) {
            int middle= start +(end-start)/2;
            if(target>arr[middle]){
                start= middle+1;

            }
            else if (target<arr[middle]) 
            {
            end= middle-1;    
            }
            else{
                return middle;
            }
            
        }

        return start;
    }
}