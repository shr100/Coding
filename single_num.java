//Link: https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length==1){
            return nums[0];
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]!=nums[i+1]){
                    
                    return nums[i];
                }
            }
            else if(i==nums.length-1){
                return nums[i];
            }
            else{
                if((nums[i-1]!=nums[i])&&(nums[i+1]!=nums[i])){
                    return nums[i];
                }
            }
            }
        }
        return 0;
    }
    
}