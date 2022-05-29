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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     
        
        List<List<Integer>>list=new ArrayList();
        
        if(root==null)return list;
        
        Queue<TreeNode>q=new LinkedList();
        
        q.offer(root);
        boolean flag=true;
        
        while(!q.isEmpty()){
            
            int n=q.size();
            
            List<Integer>temp=new ArrayList();
            
            for(int i=0;i<n;i++){
                
                TreeNode  curr=q.poll();
                
                temp.add(curr.val);
                
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            
            if(flag){
                list.add(temp);
            }
            else{
                reverse(temp);
                list.add(temp);
            }
            flag=!flag;
        }
        
        return list;
        
    }
    private void reverse(List<Integer>arr){
        
        int i=0;
        int n=arr.size()-1;
        
        while(i<n){
            
            int temp=arr.get(i);
            arr.set(i, arr.get(n));
            arr.set(n,temp);
            i++;
            n--;
        }
    }
}