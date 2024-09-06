package basicJava;

/**
 * orderAgnosticBS
 */
public class orderAgnosticBS {

    public static void main(String[] args) {
        int[] arr= {20,19,17,15,12,10,5,3,2,1};
        int target= 10;
        int ans= searchAgnosticBS(arr, target);
        System.out.println(ans);
        
    }

    private static int searchAgnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        Boolean isAsc;

        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }

        while (start<=end) {
            int middle= start+(end-start)/2;
            if(target==arr[middle]){
                return middle;
            }

            if(isAsc){
                if(target<arr[middle]){
                    end= middle-1;
                }
                else{
                    start= middle+1;
                }
            }
            else{
                if (target>arr[middle]) {
                    end= middle-1;
                }
                else{
                    start= middle+1;
                }
            
            }
        }

        return -1;
    }
}