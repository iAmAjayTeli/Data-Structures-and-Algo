package basicJava;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,9,10,45,50, 60, 70, 80,85, 98, 100, 101};
        int target= 101;
        int index=searchNumber(arr, target);
        System.out.println(index);

    }

    private static int searchNumber(int[] arr, int target){     
    int start= 0;
    int end= arr.length-1;

    while (start<=end) {
        int middle= start + (end- start) /2;
        if(target > arr[middle]){
            start= middle+1;
        }
        else if (target<arr[middle]) {
            end= middle-1;
            
        }
        else{
            return middle;
        }
    }

    return -1;
    }
}
