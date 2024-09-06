package Solutions;
import java.util.Arrays;

public class InsertionSorted {
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
    
        int num=18;

        System.out.println("Beofore inserting:"+Arrays.toString(arr));
        
        insertSorted(arr, num);

        System.out.println("After inserting:"+Arrays.toString(arr));
    }

    private static void insertSorted(int[] arr, int num){
    
        int size=6;


        int i;
        for( i=size-1; (i>0 && arr[i]>num); i--){
            arr[i+1]=arr[i];
        }

        arr[i+1]=num;

    }

}
