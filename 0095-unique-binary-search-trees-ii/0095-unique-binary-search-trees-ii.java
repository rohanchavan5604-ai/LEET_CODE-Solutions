import java.util.*;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        return generate(1, n);
    }

    private List<TreeNode> generate(int start, int end) {

        List<TreeNode> result = new ArrayList<>();

        // Base case
        if (start > end) {
            result.add(null);
            return result;
        }

        // Every number becomes root once
        for (int i = start; i <= end; i++) {

            // Generate left and right subtrees
            List<TreeNode> leftTrees = generate(start, i - 1);
            List<TreeNode> rightTrees = generate(i + 1, end);

            // Combine every left subtree with every right subtree
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {

                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;

                    result.add(root);
                }
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna