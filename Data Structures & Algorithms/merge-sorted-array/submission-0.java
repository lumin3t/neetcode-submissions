class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[n+m];
        if (m!=0) {
             for (int i=0; i<m; i++) {
               ans[i] = nums1[i];
            }
        }
        if (n!=0) {
            for (int i=0, j=m; i<n && j<m+n; i++,j++) {
                ans[j] = nums2[i];
            }
        }
        //now merge it all into nums1
        for (int i=0; i<n+m; i++) {
            nums1[i] = ans[i];
        }
        for (int i=0; i<n+m; i++) {
            int min = i;
            for (int j=i+1; j<n+m; j++) {
                if (nums1[j] < nums1[min]) {
                    min = j;
                }
            }
            int temp = nums1[min];
            nums1[min] = nums1[i];
            nums1[i] = temp;
        }
    }
}