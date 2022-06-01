/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        ArrayList<TreeNode>arr1=new ArrayList();
        ArrayList<TreeNode>arr2=new ArrayList();
        
        solve(root, p, arr1);
        solve(root, q, arr2);
        
        TreeNode res=null;
        
        for(int i=0;i<Math.min(arr1.size(),arr2.size());i++){
            
            
            if(arr1.get(i).val==arr2.get(i).val){
                res=arr1.get(i);
            }
        }
        
        return res;
        
    }
    
    private boolean solve(TreeNode root, TreeNode b, ArrayList<TreeNode>arr){
        
        if(root==null)return false;
        
        arr.add(root);
        
        if(root.val==b.val)return true;
        
        if(solve(root.left, b, arr)  || solve(root.right,b,arr)){
            return true;
        }
        
        arr.remove(arr.size()-1);
        return false;
    }
}