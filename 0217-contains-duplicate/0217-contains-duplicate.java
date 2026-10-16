class Solution {
    public boolean containsDuplicate(int[] nums) {
        
      Map<Integer,Integer> hm = new HashMap<>();

      for(int i=0; i<nums.length; i++){

        if(hm.containsKey(nums[i])){
            return true;
        }else{
            hm.put(nums[i],1);
        }

      }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna