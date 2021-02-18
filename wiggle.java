//Link : https://leetcode.com/problems/wiggle-sort-ii/
class Solution {
    public void wiggleSort(int[] nums) {
    
        int[] vals = nums.clone();
    Arrays.sort(vals);
      int len = nums.length-1;
        for(int i = 1;i<nums.length;i=i+2) {nums[i] = vals[len--];}
        for(int i = 0;i<nums.length;i=i+2) {nums[i] = vals[len--];}
    }
}