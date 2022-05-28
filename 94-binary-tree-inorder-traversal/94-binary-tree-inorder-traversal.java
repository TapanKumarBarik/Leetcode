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
    public List<Integer> inorderTraversal(TreeNode node) {
 
        List<Integer>list=new ArrayList();
        
        Stack<TreeNode>st=new Stack();
        
        if(node==null)return list;
        
       // TreeNode node =root;
        
        
        
        while(true){
            
            if(node!=null){
                
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty())break;
                    
                 node=st.pop();
                
                list.add(node.val);
               node=node.right;
            }
        }
     return list;   
    }
        
        
       /* List<Integer>list=new ArrayList();
        
        solve(list,root);
        
        return list;
        
    }
    
    private void solve(   List<Integer>list,TreeNode root){
        
        if(root ==null){
            return;
        }
         solve(list,root.left);
        list.add(root.val);
         solve(list,root.right);
        
    }*/
}