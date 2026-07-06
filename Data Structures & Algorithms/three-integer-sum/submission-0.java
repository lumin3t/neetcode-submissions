class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // brute force 
        int n = nums.length;
        Arrays.sort(nums); // sort first
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<n-2; i++) { // space for j and k
            for (int j=i+1; j<n-1; j++) { // no overlap w i and space for k
                for (int k=j+1; k<n; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!res.contains(triplet)) res.add(triplet);
                    }
                }
            }
        }
        return res;
    }
}
