import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if((i>0)&&(nums[i]==nums[i-1])) continue;
            int j=i+1;
            int k = nums.length-1;
            while(j<k){

                if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                else{
                    ArrayList<Integer> l1 = new ArrayList();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);
                    if(!list.contains(l1)) list.add(l1);
                    j++;
                    k--;
                }
            }
           
        }
   
        
        return list;
    }
}