class Solution {

    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // 1. Add current character
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // 2. Update most frequent character
            maxFreq = Math.max(maxFreq, freq[index]);

            // 3. Check whether window is invalid
            while ((right - left + 1) - maxFreq > k) {

                // 4. Remove left character
                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;

                // 5. Shrink window
                left++;
            }

            // 6. Update maximum valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}