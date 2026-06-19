class Solution {
    public int maxArea(int[] heights) {
        int l = 0, n = heights.length , r = n-1;
        int max = 0, curr = 0;
        while (l<r) {
            curr = Math.min(heights[l], heights[r]) * (r-l);
            max = Math.max(max, curr);
            if (heights[l]< heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
