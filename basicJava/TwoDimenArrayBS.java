package basicJava;

public class TwoDimenArrayBS {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int target = 6;
        System.out.println(search(arr, target));

    }

    private static Boolean search(int[][] arr, int target) {
        int row = arr.length;
        int column = arr[0].length;
        int start = 0;
        int end = row * column - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int midEle= arr[middle/column][middle%column];

            if (target < midEle) {
                end = middle - 1;
            } else if (target > midEle) {
                start = middle + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
