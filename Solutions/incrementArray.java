package Solutions;

import java.util.Arrays;

public class incrementArray {
    public static void main(String[] args) {
       int[] arr= {5,6,7};
       int[] resArray= onePlus(arr);

       System.out.println(Arrays.toString(resArray));

    }

    private static int[] onePlus(int[] arr){
        int size= arr.length;

        for (int i = size-1; i >=0; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            else{
                arr[i]=0;
            }
        }

        arr=new int[size+1];
        arr[0]=1;

        return arr;
    }
}
