package basicJava;

import java.util.List;

public class ArrayOperation {
    public static void main(String[] args) {
     
        
    }

     public boolean searchEle(List<Integer> arr, int x) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==x){
                return true;
            }
        }
        return false;
    }

    public void insertEle(List<Integer> arr, int y, int yi) {
       arr.add(yi, y);
        System.out.print(true);
       
      
    //   if(arr.get(yi)==y){
    //       System.out.print(true);
    //   }
    //   else{
    //      System.out.print(false); 
    //   }
      
      
    }

    public void deleteEle(List<Integer> arr, int z) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==z){
                arr.remove(i);
               System.out.print(true);
            }
            else{
                System.out.print(false);
            }
        }

        
        
    }
}
