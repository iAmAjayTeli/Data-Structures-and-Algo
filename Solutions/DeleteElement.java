package Solutions;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr= {10, 50, 30, 40, 20};
        int target= 30;
        int size= deleteElement(arr, target);
       for (int i = 0; i < size; i++) {
         System.out.print(arr[i]+" ");
       }
    }

    private static int deleteElement(int[] arr, int target){
        int pos= findPosition(arr, target);
        int size= arr.length;

        for(int i=pos; i<size-1; i++){
            arr[i]=arr[i+1];
        }

        return size-1;
    }

    private static int findPosition(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
