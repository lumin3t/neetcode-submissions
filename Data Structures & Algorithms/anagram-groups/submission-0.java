class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            int m = strs[i].length();
            char[] mystr = new char[m];
            mystr = strs[i].toCharArray(); 
            Arrays.sort(mystr);
            String sorted = new String(mystr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
