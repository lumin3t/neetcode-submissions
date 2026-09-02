class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // brute force method
        int m = s1.length(); 
        int n = s2.length();
        for (int i=0; i<=n-m; i++) {
           String sub = s2.substring(i, i+m);
           if (isAnagram(s1, sub)) return true; 
        }
        return false;
    }
    public boolean isAnagram(String s, String t) {
        // frequency pass
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) if (count != 0) return false;
        return true;
    }
}
