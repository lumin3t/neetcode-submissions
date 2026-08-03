class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        int[] ans = new int[n];
        int i = n-1;
        while (l<=r) {
            int lsq = nums[l]*nums[l];
            int rsq = nums[r]*nums[r];
            if (lsq>=rsq) {
                ans[i] = lsq;
                l++;
            } else {
                ans[i] = rsq;
                r--;
            }
            i--;
        }
        return ans;
    }
}