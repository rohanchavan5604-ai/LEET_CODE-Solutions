class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for(int i=31; i>=0;i--){
            int bit = n & 1;
            res = res + (bit<<i);
            n= n>>1;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna