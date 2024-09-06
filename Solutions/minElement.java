package Solutions;

public class minElement {


    public static void main(String[] args) {
        int[] arr={3,1,5,6,1};
        System.out.println(smallestElement(arr));
    }

    private static int smallestElement(int[] array){
        int min= array[0];
      for(int i=0; i<array.length; i++) {
            if(array[i]<min){
                min= array[i];
            }
            else{
                continue;
            }
        }

        return min;
    }
}
