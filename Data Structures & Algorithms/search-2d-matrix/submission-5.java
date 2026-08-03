class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // binary search entire matrix O(log(n*m))
        //treat matrix as  1D sorted array
        int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0, r=rows*cols-1;
        while(l<=r) {
            int mid = (l+r)/2;
            // convert mid to matrix indices
            int row = mid/cols; // how many rows have passed
            int col = mid%cols; // where it is in that row repeated cols period
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return false;
    }
}
