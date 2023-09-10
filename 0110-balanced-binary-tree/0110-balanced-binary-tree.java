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
      Tc = o(N)
      Sc = o(1)
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
         return defHeight (root) != -1;

}
        int defHeight(TreeNode root){
            if(root == null) return 0;

            int leftHeight = defHeight(root.left);
            if(leftHeight == -1)return -1;

            int rightHeight = defHeight(root.right);
            if(rightHeight == -1) return -1;

            if(Math.abs(leftHeight-rightHeight ) > 1)return -1;
            return Math.max(leftHeight,rightHeight) +1;
        }
    }
