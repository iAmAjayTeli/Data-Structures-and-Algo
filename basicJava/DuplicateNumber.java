package basicJava;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(findDuplicateNum(arr));

        int a=5;
        int b=6;
        System.out.println(a+" "+b);
    }

    private static int findDuplicateNum(int[] arr){
        int i=0;
        //sort the array using the cyclic sort
        while (i<arr.length) {
            int correctIndex= arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        //check the duplicate element
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                return arr[index];
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

   

}
