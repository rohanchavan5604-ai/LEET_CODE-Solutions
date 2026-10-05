class Solution {
    public int hammingWeight(int n) {
        
        int bits =0;
        int mask= 1;

        for(int i=1; i<32; i++){
            if((mask & n)!=0){
                bits++;
            }
            mask<<=1;
        }
        return bits;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna