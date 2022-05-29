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
    public boolean isBalanced(TreeNode root) {
        
        
        if(root==null)return true;
       int res=solve(root);
        
        if(res==-1)return false;
        return true;
    }
    
    private int solve(TreeNode node){
        
        if(node==null)return 0;
        
        int left=solve(node.left);
        
        if(left==-1)return -1;
        int right=solve(node.right);
        if(right==-1)return -1;
        if(Math.abs(left-right)>1)return -1;
        return 1+Math.max(left,right);
    }

}