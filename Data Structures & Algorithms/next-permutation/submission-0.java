class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]) {
            i--; // find pivot first decreasing element (not greater than pakkaddu)
        }
        if (i>=0) {
            int j = n-1;
            while (nums[j] <= nums[i]) {
                j--; // finding swap first element greater than pivot
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1); // reverse after the pivot alwayssss
    }
    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    void reverse(int[] nums, int start) {
        int end=nums.length-1;
        while (start<end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}