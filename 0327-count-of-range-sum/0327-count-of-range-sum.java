class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return (int) mergeSort(prefix, 0, n, lower, upper);
    }

    private long mergeSort(long[] sums, int left, int right, int lower, int upper) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        long count = mergeSort(sums, left, mid, lower, upper)
                   + mergeSort(sums, mid + 1, right, lower, upper);

        int low = mid + 1;
        int high = mid + 1;

        for (int i = left; i <= mid; i++) {
            while (low <= right && sums[low] - sums[i] < lower) {
                low++;
            }

            while (high <= right && sums[high] - sums[i] <= upper) {
                high++;
            }

            count += high - low;
        }

        long[] merged = new long[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (sums[i] <= sums[j]) {
                merged[k++] = sums[i++];
            } else {
                merged[k++] = sums[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = sums[i++];
        }

        while (j <= right) {
            merged[k++] = sums[j++];
        }

        System.arraycopy(merged, 0, sums, left, merged.length);

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna