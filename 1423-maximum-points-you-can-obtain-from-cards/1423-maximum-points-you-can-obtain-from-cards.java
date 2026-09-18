class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        int rindex = n - 1;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
            maxsum = lsum;
        }
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex];
            rindex--;

            maxsum = Math.max(maxsum, lsum + rsum);
        }

        return maxsum;
    }
}