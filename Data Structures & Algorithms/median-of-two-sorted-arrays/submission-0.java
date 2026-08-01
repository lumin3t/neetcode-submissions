class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // brute force 
        int n = nums1.length, m = nums2.length;
        int[] merged = new int[m+n];
        int i=0;
        for (int j=0; j<n; j++) {
            merged[i++] = nums1[j];
        }
        for (int j=0; j<m; j++) {
            merged[i++] = nums2[j];
        }
        Arrays.sort(merged);
        int k = n + m;
        if (k % 2 == 1) {
            return merged[k / 2];
        }
        return (merged[k / 2] + merged[k / 2 - 1]) / 2.0;
    }
}
