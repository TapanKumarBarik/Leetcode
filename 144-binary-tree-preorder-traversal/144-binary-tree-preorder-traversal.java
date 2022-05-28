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
    public List<Integer> preorderTraversal(TreeNode root) {
        
               
        
        
              List<Integer>list=new ArrayList();
        
        if(root==null)return list;
        
        Stack<TreeNode>st=new Stack();
        
        
        st.push(root);
        
        while(!st.isEmpty()){
            
            int n=st.size();
            
            for(int i=0;i<n;i++){
                
                TreeNode curr=st.pop();
                
                list.add(curr.val);
                
                if(curr.right!=null){
                    st.push(curr.right);
               }
                
                if(curr.left!=null){
                    st.push(curr.left);
                }

                
            }
        }
        
        return list;
    }
        
        
        /*List<Integer>list=new ArrayList();
        
         solve(list, root);
        
        return list;
        
    }
        private void solve(List<Integer>list, TreeNode root){
            
            if(root==null){
                return ;
            }
            list.add(root.val);
            solve(list, root.left);
            solve(list, root.right);
            
            
        }*/
}