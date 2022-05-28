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
    public int maxDepth(TreeNode root) {
           
    
       int depth=0;
        if (root == null)
            return depth;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            depth++;
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }  
        }
        return depth;
    }
}