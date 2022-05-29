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
    int max;
    public int maxPathSum(TreeNode root) {
        
        max=Integer.MIN_VALUE;
        
        if(root==null)return 0;
        
        solve( root);
        return max;
            
        
    }
    
    private int solve( TreeNode root){
        
        if(root==null)return 0;
        
        int lh=Math.max(0,solve(root.left));
        
        int rh=Math.max(0,solve(root.right));
        
        
        
        max=Math.max(max,lh+rh+root.val);
        
        return root.val+Math.max(lh,rh);
    }
}