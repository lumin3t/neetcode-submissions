class Solution {
    public int[] productExceptSelf(int[] nums) {
        // O(n) Prefix sum
        int n = nums.length;
        int[] leftPrefix = new int[n];
        leftPrefix[0] = 1;
        int[] rightPrefix = new int[n];
        rightPrefix[n-1] = 1;
        int[] output = new int[n];
        for (int i=1; i<n; i++) {
            leftPrefix[i] = leftPrefix[i-1]*nums[i-1];
        }
        for (int i=n-2; i>=0; i--) {
            rightPrefix[i] = rightPrefix[i+1]*nums[i+1];
        }
        for (int i=0; i<n; i++) {
            output[i] = (leftPrefix[i]*rightPrefix[i]);
        }
        return output;
    }
}  
