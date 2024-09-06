package basicJava;

public class DeletingElementSorted {
    public static void main(String[] args) {
        int[] arr={ 10, 20, 30, 40, 50};
        int target=30;
        int size= deleteElement(arr, target);
         for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
         }
    }

    private static int deleteElement(int[] arr, int target){
        int pos= findElement(arr, target, 0, arr.length-1);
        int size= arr.length;

        for(int i=pos; i<size-1; i++){
            arr[i]=arr[i+1];
        }

        return size-1;
    }

    private static int findElement(int[] arr, int target, int start, int end){
        while (start<=end) {
            int middle=start+(end-start)/2;

            if(target>arr[middle]){
                return findElement(arr, target, middle+1, end);
            }
            else if(target<arr[middle]){
                return findElement(arr, target, start, end-1);
            }
            else{
                return middle;
            }
         }

         return -1;
    }
}
