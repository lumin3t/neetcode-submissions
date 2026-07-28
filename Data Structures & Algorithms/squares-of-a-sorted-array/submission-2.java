class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        int i = n-1;
        int[] ans = new int[n];
        while (l<=r) {
            if (Math.abs(nums[l])>=Math.abs(nums[r])) {
                ans[i] = nums[l]*nums[l];
                l++;
            } else {
                ans[i] = nums[r]*nums[r];
                r--;
            }
            i--;
        }
        return ans;
    }
}