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
        // Base case: If the node is null, its depth is 0
        if (root == null) {
            return 0;
        }
        
        // 1. Traverse Left (Post-order step)
        int leftDepth = maxDepth(root.left);
        
        // 2. Traverse Right (Post-order step)
        int rightDepth = maxDepth(root.right);
        
        // 3. Process Root (Post-order step)
        // The depth of the current node is 1 + the max depth of its children
        return Math.max(leftDepth, rightDepth) + 1;
    }
}