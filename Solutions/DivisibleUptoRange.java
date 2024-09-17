package Solutions;

import java.util.ArrayList;;

public class DivisibleUptoRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 30;
        System.out.println(findDivisible(start, end));
    }

    private static ArrayList<Integer> findDivisible(int start, int end) {
        ArrayList<Integer> ans = new ArrayList<>();

        while (start <= end) {
            char[] ch = (Integer.toString(start)).toCharArray();

            boolean isDivisible= verifyisDivisible(start, ch);

            if(isDivisible){
                ans.add(start);
            }
        
            start++;
        }

    return ans;

    }

    private static boolean verifyisDivisible(int num, char[] ch) {
       for(int i=0; i<ch.length; i++){
         if(ch[i]=='0' || num%(Integer.parseInt(Character.toString(ch[i])))!=0){
            return false;
         }
       }

       return true;
    }
}
