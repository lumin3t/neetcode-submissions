class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // optimal sliding window maximum
        int l=0, r=0;
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int i=0;
        Deque<Integer> dq = new ArrayDeque<>(); // indices
        while (r < nums.length) {
            // remove elements lesser than nums[r]
           while (!dq.isEmpty() && nums[r] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(r);
            // remove out of bounds l
            while (!dq.isEmpty() && l>dq.peekFirst()) {
                dq.pollFirst();
            }
            if (r+1 >= k) {
                ans[i++] = nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return ans;
    }
}
