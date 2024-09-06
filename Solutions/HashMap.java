package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class HashMap {
    public static void main(String[] args) {
        ArrayList<Integer> A
            = new ArrayList<>(List.of(1, 5, 10, 20, 30));
        ArrayList<Integer> B
            = new ArrayList<>(List.of(5, 13, 15, 20));
        ArrayList<Integer> C
            = new ArrayList<>(List.of(5, 20));


            System.out.println(commonElements(A, B, C));
    }

    private static ArrayList<Integer> commonElements(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C){
        ArrayList<Integer> ans=new ArrayList<>();

          TreeMap<Integer, Integer> map=new TreeMap<>();

          for(int ele: A){
            map.put(ele, 1);
          }

          for(int ele: B){
            if(map.containsKey(ele) && map.get(ele)==1){
                map.put(ele, 2);
            }
            
          }

          for(int ele: C){
            if(map.containsKey(ele) && map.get(ele)==2){
                map.put(ele, 3);
            }
            
          }

          for(int ele:map.keySet()){
            if(map.get(ele)==3){
                ans.add(ele);
            }
        }


        return ans;
    }
}
