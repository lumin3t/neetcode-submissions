class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sca = s.toCharArray();
        Arrays.sort(sca);
        char[] tca = t.toCharArray();
        Arrays.sort(tca);
        boolean same = true;
        for (int i=0; i<s.length(); i++) {
            if (sca[i] != tca[i]) {
                same = false;
            } 
        }
        return same;
    }
}
