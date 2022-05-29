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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer>res=new ArrayList();
        if(root==null)return res;
        List<List<Integer>>list=new ArrayList();
        Queue<TreeNode>q=new LinkedList();
        
        q.offer(root);
        while(!q.isEmpty()){
            
            int n=q.size();
            List<Integer>temp=new ArrayList();
            for(int i=0;i<n;i++){
                
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            list.add(temp);
        }
        
        for(int i=0;i<list.size();i++){
            res.add(list.get(i).get(list.get(i).size()-1));
        }
        return res;
    }
}