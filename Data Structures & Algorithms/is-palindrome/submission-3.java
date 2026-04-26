class Solution {
    public boolean isPalindrome(String s) {
          if (s == null) {
            return false; 
        }
        s = s.toLowerCase(); 
        s = s.replaceAll("[^a-zA-Z0-9]", ""); // Remove non-letter characters
        if (s.isEmpty()) {
            return true; 
        }
        int n = s.length()-1;
        for (int i=0; i<=n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i)) {
                return false;
            }
        }
        return true;
    }
}
