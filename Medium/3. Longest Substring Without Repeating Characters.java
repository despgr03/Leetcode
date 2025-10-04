class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() > 0) {
            StringBuilder longestSubstring = new StringBuilder();
            longestSubstring.append(s.charAt(0));
            int maxCount = 1;
            for (int i = 1; i < s.length(); i++) {
                char character = s.charAt(i);
                if (longestSubstring.toString().indexOf(character) != -1) {
                    if (longestSubstring.length() > maxCount) {
                        maxCount = longestSubstring.length();
                    }
                    longestSubstring.delete(0, longestSubstring.toString().indexOf(character) + 1);
                }
                longestSubstring.append(character);
            }
            if (longestSubstring.length() > maxCount) {
                maxCount = longestSubstring.length();
            }
            return maxCount;
        }
        return 0;
    }
}
