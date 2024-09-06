package Solutions;

/**
 * linearSearch
 */
public class linearSearch {

    public static void main(String[] args) {
        int[] arr= {4,5,6,2,7};
        int searchElement= 2;
        System.out.println(search(arr, searchElement));

        
    }

    private static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=0; i<arr.length; i++) {
                if(arr[i]==target){
                   return i;
                }
            }
        }

        return -1;
    }
}