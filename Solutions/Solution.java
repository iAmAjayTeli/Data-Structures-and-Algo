package Solutions;


public class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] sumArr= new int[2];
        
                for(int i=0; i<nums.length; i++){
                   for(int j=i+1; j<nums.length-1; j++){
                    if(nums[i] + nums[j]==target){
                        sumArr=new int[]{i,j};
                        System.out.println(sumArr);
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }
    
            return sumArr;
        }

        public static void main(String[] args) {
            Solution sol=new Solution();

            System.out.println(sol.twoSum(new int[]{1,2,3,4}, 5));
         
        }
    }
