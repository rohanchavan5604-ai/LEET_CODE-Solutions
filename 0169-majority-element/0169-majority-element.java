class Solution {
    public int majorityElement(int[] nums) {
        
        int cand =0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                cand = nums[i];

            }
            if(cand==nums[i]){
                count++;
            }else{
                count--;
            }

        }
        return cand;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna