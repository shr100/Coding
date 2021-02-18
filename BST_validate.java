//Link : https://leetcode.com/problems/validate-binary-search-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return dummy(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }
    public boolean dummy(TreeNode p,double min,double max){
        if(p==null){
            return true;
        }
        
        if((p.val<=min)||(p.val>=max))
        {
            return false;
        }
        boolean leftBST = dummy(p.left,min,p.val);
        boolean rightBST = dummy(p.right,p.val,max);
        
        if((leftBST&&rightBST)==false){
            return false;
        }
        
        
        return true;
}
}