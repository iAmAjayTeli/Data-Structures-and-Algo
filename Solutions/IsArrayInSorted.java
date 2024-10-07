package Solutions;

public class IsArrayInSorted {
    public static void main(String[] args) {
        int arr[]={1,2,5,6};
        int n=arr.length;
        System.out.println(isSorted(arr, n));
    }
    private static boolean isSorted(int[] arr, int n){
        if(n==1){
            return true;
        }
        
        return arr[n-1]<arr[n-2]?false : isSorted(arr, n-1);
    }
}
