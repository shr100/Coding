//Link : https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length > 1){
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                
                }
            }
        }
    }
}