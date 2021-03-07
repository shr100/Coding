import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        Comb(list,list1,candidates,target,0);
        
        return list;
        
    }
    
    public void Comb(List<List<Integer>> list, ArrayList<Integer> list1, int[] cand , int target, int s_ind ){
        if(target==0){
            list.add(new ArrayList<>(list1));
            return ;
        }
        
        for(int i=s_ind ; i<cand.length; i++){
            if(target < cand[i]) break;
            
            list1.add(cand[i]);
            Comb(list,list1,cand,target-cand[i],i);
            
            //Backtracking
            list1.remove(list1.size()-1);
        }
    }
}