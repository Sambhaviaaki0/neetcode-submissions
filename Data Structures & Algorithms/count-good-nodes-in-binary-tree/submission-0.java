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
    public int goodNodes(TreeNode root) {
        return findgoodnodes(root , root.val);
    }
    private int findgoodnodes(TreeNode root , int best) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        if(root.val >= best) {
            count++;
        }
        best = Math.max(best , root.val);
        count += findgoodnodes(root.left , best);
        count += findgoodnodes(root.right , best);

        return count;
    }
}
