class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String res = new StringBuilder(s).reverse().toString();
        return res.equals(s);
    }
}
