package Solutions;

/**
 * smallestElement
 */
public class smallestElement {

    public static void main(String[] args) {
        int[] arr={3,1,5,6,1};
        System.out.println(minElement(arr));
    }

    private static int minElement(int[] array){
        int min= array[0];
        for (int i : array) {
            if(array[i]<min){
                min= array[i];
            }
            
        }

        return min;
    }
}