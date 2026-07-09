class Solution {
    public int[] productExceptSelf(int[] nums) {
        // O(n) approah division approach
        int zeros = 0;
        int n = nums.length;
        int[] output = new int[n];
        int product = 1;
        for (int i=0; i<n; i++) {
            if (nums[i]==0) {
                zeros++;
            } else {
                product*=nums[i];
            }
        }
        for (int i=0; i<n; i++) {
            if (zeros>1) {
                output[i] = 0;
            } else if (zeros==1) {
                if (nums[i]==0) {
                    output[i] = product;
                } else {
                    output[i] = 0;
                }
            } else {
                output[i] = product/nums[i];
            }
        }
        return output;
    }
}  
