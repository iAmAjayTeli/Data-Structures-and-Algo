package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;;

public class MergeKSorted {
    public static void main(String[] args) {
        //  List<Integer> A = Arrays.asList(1, 2, 3, 5);
        // List<Integer> B = Arrays.asList(6, 7, 8, 9);
        // List<Integer> C = Arrays.asList(10, 11, 55, 12);

        // mergeAndSort(A, B, C);

        
        int[] a = { 1, 2, 3, 5 };
        int[] b = { 6, 7, 8, 9 };
        int[] c = { 10, 11, 12 };

        mergeArray(a, b, c);

        
    }
    

    //Native approach
    private static void mergeAndSort(List<Integer> A, List<Integer> B, List<Integer> C){
        ArrayList<Integer> ans= new ArrayList<>();

        ans.addAll(A);
        ans.addAll(B);
        ans.addAll(C);

        Collections.sort(ans);

        System.out.println(ans);
    }


    //merge two array and then resultant with the third array
    private static void  mergeArray(int[] a, int[] b, int[] C){
        ArrayList<Integer> ans= new ArrayList<>();

        
    }
}
