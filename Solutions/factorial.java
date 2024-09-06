package Solutions;

import java.util.ArrayList;

public class factorial {
    public static void main(String[] args) {
        ArrayList<Integer> ans= new ArrayList<>();
    System.out.println(printfactorial(6,2, ans));
    }

    private static ArrayList<Integer> printfactorial(int num, int i, ArrayList<Integer> ans){

        //base condition
        if(i==num){
            return ans;
        }

        if(num%i==0){
            ans.add(i);
        }

        return printfactorial(num, i+1, ans);
    }
    
}
