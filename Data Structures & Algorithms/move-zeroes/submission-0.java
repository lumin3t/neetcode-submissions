class Solution {
    public void moveZeroes(int[] nums) {
        int nzi = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[nzi]=nums[i];
                nzi++;
            }
        }
        for(int i=nzi; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}