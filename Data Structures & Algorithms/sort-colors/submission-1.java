class Solution {
    public void sortColors(int[] nums) {
        //counting sort
        int zero=0, one=0, two=0, index=0;
        int n = nums.length;
        for (int i=0; i<n; i++) {
            if (nums[i]==0) {
                zero++;
            } else if (nums[i]==1) {
                one++;
            } else {
                two++;
            }
        }
        while(zero>0 && index<n) {
            nums[index] = 0;
            index++;
            zero--;
        }
        while(one>0 && index<n) {
            nums[index] = 1;
            index++;
            one--;
        }
        while(two>0 && index<n) {
            nums[index] = 2;
            index++;
            two--;
        }
    }
}