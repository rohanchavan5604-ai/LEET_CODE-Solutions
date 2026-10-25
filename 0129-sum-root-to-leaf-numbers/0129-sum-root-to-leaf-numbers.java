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
    public int sumNumbers(TreeNode root) {
        return calculateSum(root, 0);
    }

    private int calculateSum(TreeNode root, int currentNumber) {
        if (root == null) {
            return 0;
        }
        currentNumber = currentNumber * 10 + root.val;
        if (root.left == null && root.right == null) {
            return currentNumber;
        }
        return calculateSum(root.left, currentNumber) + calculateSum(root.right, currentNumber);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna