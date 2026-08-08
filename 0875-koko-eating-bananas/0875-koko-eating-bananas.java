class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Maximum possible answer
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Binary search on eating speed
        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Check if Koko can finish within h hours
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // mid is possible
                // Try to find a smaller speed
                high = mid - 1;
            } else {
                // mid is too slow
                low = mid + 1;
            }
        }

        return low;
    }
}