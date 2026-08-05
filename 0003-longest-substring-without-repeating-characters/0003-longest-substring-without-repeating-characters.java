class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

    int left =0;
    int max =0;

    for(int i=0; i<s.length(); i++){

        while(set.contains(s.charAt(i))){

set.remove(s.charAt(left));
left++;

        }
        set.add(s.charAt(i));

max = Math.max(max, i - left + 1);

    }
    return max;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna