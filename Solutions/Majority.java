package Solutions;

public class Majority {
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 2, 2};
        int target=1;
       System.out.println(isMajority(arr, target)); 
    }

    private static Boolean isMajority(int[] arr, int target){
        int size= arr.length;
        int correctMajority= size/2;
        int count=0;

        for(int i=0; i<size-1; i++){
            if(arr[i]==target){
                count++;
            }
        }

        if(count>correctMajority){
            return true;
        }

        return false;
    }
}
