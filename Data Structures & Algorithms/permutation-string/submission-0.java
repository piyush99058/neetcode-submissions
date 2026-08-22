class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int windowSize = s1.length();

        for (int right = 0; right < s2.length(); right++) {
            // Add the current character to the window
            window[s2.charAt(right) - 'a']++;

            // Keep the window size equal to s1.length()
            if (right >= windowSize) {
                char leftChar = s2.charAt(right - windowSize);
                window[leftChar - 'a']--;
            }

            // Compare the frequency arrays
            if (right >= windowSize - 1 && sameCounts(need, window)) {
                return true;
            }
        }

        return false;
    }

    private boolean sameCounts(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}