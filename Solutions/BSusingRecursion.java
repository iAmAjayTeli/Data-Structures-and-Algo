package Solutions;

public class BSusingRecursion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,77,88};
        int target=3;
        System.out.println(binarySearch(arr, target, 0, arr.length));
    }

    private static int binarySearch(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }

        int middle= start+(end-start)/2;

        if(target>arr[middle]){
            return binarySearch(arr, target, middle+1, end);
        }
        else if(target<arr[middle]){
            return binarySearch(arr, target, start, middle-1);
        }
       

        return middle;
    }
}
