class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] memo = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(s, p, 0, 0, memo);
    }

    private boolean dfs(String s, String p, int i, int j, Boolean[][] memo) {
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        if (j == p.length()) {
            return memo[i][j] = (i == s.length());
        }

        boolean firstMatch = i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        boolean ans;

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            ans = dfs(s, p, i, j + 2, memo)
                    || (firstMatch && dfs(s, p, i + 1, j, memo));
        } else {
            ans = firstMatch && dfs(s, p, i + 1, j + 1, memo);
        }

        return memo[i][j] = ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna