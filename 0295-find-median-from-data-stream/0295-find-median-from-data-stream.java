class MedianFinder {

    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;

    public MedianFinder() {

        // Max Heap
        small = new PriorityQueue<>(Collections.reverseOrder());

        // Min Heap
        large = new PriorityQueue<>();
    }

    public void addNum(int num) {

        small.add(num);

        large.add(small.poll());

        if (large.size() > small.size()) {
            small.add(large.poll());
        }
    }

    public double findMedian() {

        if (small.size() > large.size()) {
            return small.peek();
        }

        return (small.peek() + large.peek()) / 2.0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna