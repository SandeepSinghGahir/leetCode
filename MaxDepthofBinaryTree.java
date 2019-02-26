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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count_left = maxDepth(root.left);
        int count_right = maxDepth(root.right);
        return count_left > count_right ? count_left+1 : count_right+1;
        
    }
}
