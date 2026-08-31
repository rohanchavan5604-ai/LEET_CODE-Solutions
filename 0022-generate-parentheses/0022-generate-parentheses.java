class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        backtrack("", 0, 0, n, result);

        return result;
    }

    public void backtrack(String current, int open, int close,
                           int n, List<String> result) {

        if (open == n && close == n) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            backtrack(current + ")", open, close + 1, n, result);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna