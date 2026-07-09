class Solution {
    public int[] productExceptSelf(int[] nums) {
        // brute force
        int n = nums.length;
        int[] output = new int[n];
        for (int i = 0; i<n; i++) {
            int product = 1;
            for (int j=0; j<n; j++) {
                if (j==i) continue;
                product*=nums[j];
            }
            output[i] = product;
        }
        return output;
    }
}  
