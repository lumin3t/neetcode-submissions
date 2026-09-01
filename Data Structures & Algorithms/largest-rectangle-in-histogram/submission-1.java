class Solution {
    public int largestRectangleArea(int[] heights) {
        // optimal way O(n)
        int max=0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        for (int i=0; i<=n; i++) {
            int h = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty()) {
                    width = i;
                } else {
                    width = i-stack.peek()-1;
                }
                int curr = height*width;
                max = Math.max(max, curr);
            }
            stack.push(i);
        }
        return max;
    }
}
