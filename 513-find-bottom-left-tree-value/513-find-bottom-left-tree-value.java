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
    public int findBottomLeftValue(TreeNode root) {
        
        List<List<Integer>>list=new ArrayList();
        
        Queue<TreeNode>q=new LinkedList();
        
        if(root==null)return 0;
        
        q.offer(root);
        
        while(!q.isEmpty()){
              int n = q.size();
            ArrayList<Integer> temp = new ArrayList();

            for (int i = 0; i < n; i++) {

                TreeNode curr = q.poll();

                temp.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            list.add(temp);
        }
        
        return list.get(list.size()-1).get(0);
        
    }
}