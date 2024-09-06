package basicJava;

import java.util.List;
import java.util.ArrayList;

public class ThreeArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 20, 40, 80 };
        int[] arr2 = { 6, 7, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

        List<Integer> ans= commonElements(arr1, arr2, arr3);
    }

    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
            List<Integer> arr3) {

        List<Integer> ans = new ArrayList<Integer>();
        ans.add(5);

        System.out.println(arr1.get(0).equals(5));

        int i, j = 0, k = 0;

        for (i = 0; i < arr1.size(); i++) {
            for (j = 0; j < arr2.size(); j++) {
                for (k = 0; k < arr3.size(); k++) {
                   
                }
            }
        }

        return ans;
    }
}
