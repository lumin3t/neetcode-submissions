class Solution {
    // using boolean [used] to keep track of int used in array
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> sol = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        backtrack(nums, used);
        return res;
    }
    public void backtrack(int[] nums, boolean[] used) {
        int n = nums.length;
        if (sol.size() == n) res.add(new ArrayList<>(sol));
        for (int i=0; i<n; i++) {
            if (used[i]) continue;
            used[i] = true;
            sol.add(nums[i]); // add new num
            backtrack(nums, used); // add remaining int to permutation
            sol.remove(sol.size()-1); // remove last element
            used[i] = false;
        }
    }
}
