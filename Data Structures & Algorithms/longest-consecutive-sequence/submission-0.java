class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //Longest Consecutive Sequence
        for (int num: nums) {
            set.add(num);
        }
        int longestSum = 0;
        for (int num: set) {
            if (!set.contains(num-1)) {
                int currNum = num-1;
                int currSum = 0;
                while (set.contains(currNum+1)) {
                    currSum++;
                    currNum++;
                }
                longestSum = Math.max(currSum, longestSum);
            }
        }
        return longestSum;
    }
}
