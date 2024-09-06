
package Solutions;

public class maxElement {
    public static void main(String[] args) {
        int[] arr= {2,4,7,1};
        System.out.println(max(arr));
    }

    private static int max(int[] arr){
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
            else{
                continue;
            }
        }

        return max;
    }
}
