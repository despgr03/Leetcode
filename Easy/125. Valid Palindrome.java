class Solution {
    public boolean isPalindrome(String s) {
        String trimmed=s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        StringBuilder reversed= new StringBuilder(trimmed);
        reversed.reverse();
        return trimmed.equals(reversed.toString());
    }
}
