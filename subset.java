class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        recursion(0,nums,res,arr);
        return res;
        
    }
    
    //Can have two branches on the recursion tree
    //1. Adding to subset
    //2. Not adding to subset
    public void recursion(int index, int[] nums, List<List<Integer>> res,  ArrayList<Integer> arr ){
        if(index == nums.length){
            res.add(new ArrayList(arr));
            return;
        }
       
        //If adding to subset
        arr.add(nums[index]);
        recursion(index+1,nums,res,arr);
        
        //If not
        arr.remove(arr.size()-1);
        recursion(index+1,nums,res,arr);
    }
}