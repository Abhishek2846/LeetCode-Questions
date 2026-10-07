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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> alist=new ArrayList<>();
        pre(root,0,alist);
        return alist;
    }
    public static void pre(TreeNode root,int l,List<List<Integer>>alist)
    {
        if(root==null)
            return;
        if(alist.size()==l)
        {
            List<Integer>li=new ArrayList<>();
            li.add(root.val);
            alist.add(li);
        }
        else
            alist.get(l).add(root.val);
        pre(root.left,l+1,alist);
        pre(root.right,l+1,alist);
    }
}