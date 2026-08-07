class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index=1;

        for(int i=1; i<nums.length; i++){

if(nums[i]!= nums[i-1]){

nums[index] = nums[i];

index ++;

}

        }
        return index;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna