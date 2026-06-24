class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        /*for (int i = 1; i<=n*n; i++) {
            map.put(i, 0); // Initialize map
        }*/
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        /*int m = n*n;
        int sum = m*(m+1)/2;
        for (int num: map.keySet()) {
            sum-=num;
        }*/
        int repeat = 0, missing = 0;
        for (int i=1; i<=n*n; i++) {
            if (map.getOrDefault(i, 0) == 0) {
                missing=i;
            }
            if (map.getOrDefault(i, 0) == 2) {
                repeat=i;
            }
        }
        return new int[]{repeat, missing};
    }
}