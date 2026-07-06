class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // brute force 
        int n = nums.length;
        Arrays.sort(nums); // sort first
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<n-3; i++) { // space for j and k
            for (int j=i+1; j<n-2; j++) { // no overlap w i and space for k
                for (int k=j+1; k<n-1; k++) {
                    for (int l=k+1; l<n; l++) {
                        if ((long)nums[i]+nums[j]+nums[k]+nums[l] == target) {
                            List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            if (!res.contains(quad)) res.add(quad);
                        }
                    }
                }
            }
        }
        return res;
    }
}