import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            // Number of characters that need replacement
            int changes = (right - left + 1) - maxFreq;

            while (changes > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;

                changes = (right - left + 1) - maxFreq;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}