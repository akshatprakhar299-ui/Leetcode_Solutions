class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 0;
            }
        }

        return Math.max(maxLen, len);
    }
}