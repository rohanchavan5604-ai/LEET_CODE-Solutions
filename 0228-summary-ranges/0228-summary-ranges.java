class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            int start = nums[i];

            while (i + 1 < nums.length && (long) nums[i + 1] == (long) nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }

            i++;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna