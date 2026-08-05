class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        while (x > 0) {

            int rem = x % 10;

            rev = rev * 10 + rem;

            x = x / 10;
        }

        return original == rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna