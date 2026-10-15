import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        result.add(0);

        for (int i = 0; i < n; i++) {
            int size = result.size();

            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) | (1 << i));
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna