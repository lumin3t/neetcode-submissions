class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        String ans = ""; 
        int minLen = Integer.MAX_VALUE;
        for (int i=0; i<s.length(); i++) {
            for (int j=i; j<s.length(); j++) {
                String sub = s.substring(i, j+1);
                if (isValid(sub, t)) {
                    if (sub.length() < minLen) {
                        ans = sub;
                        minLen = sub.length();
                    }
                }
            }
        }
        return (minLen == Integer.MAX_VALUE) ? "" : ans;
    }   
    public boolean isValid(String sub, String t) {
        char[] freq = new char[128]; // for 128 characters
        for (char c: sub.toCharArray()) {
            freq[c]++;
        }
        for (char c: t.toCharArray()) {
            if (freq[c]==0) return false;
            freq[c]--;
        }
        return true;
    }
}
