class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visit = new boolean[nums.length]; 
        backtrack(res,arr,nums,visit);
        return res;
    }
    private void backtrack(List<List<Integer>> res,  ArrayList<Integer> arr, int[] nums, boolean[] visit){
        if(arr.size()==nums.length){
            res.add(new ArrayList(arr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(visit[i]) continue;
            visit[i] = true;
            arr.add(nums[i]);
            backtrack(res,arr,nums,visit);
            
            arr.remove(arr.size()-1);
            visit[i]=false;
        }
    }
}