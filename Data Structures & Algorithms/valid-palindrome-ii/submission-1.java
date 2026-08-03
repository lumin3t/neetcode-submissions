class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;
        boolean chance = true;
        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                if (chance) {
                    chance = false;
                    if (isValid(s, left+1, right)) return true;
                    if (isValid(s, left, right-1)) return true;
                }
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isValid(String s, int left, int right) {
        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}