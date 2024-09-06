package basicJava;

public class leetCode2 {
    public static void main(String[] args) {
        int[] arr= {1,23,4,4,5};
        int target= 4;
        removeElement(arr, target);
        System.out.println(arr);
        
    }
    
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++; 
            }
        }
        
        return k;
    }
}
