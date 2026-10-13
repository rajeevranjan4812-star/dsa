class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            int start = 0;
            int firstNeg = -1;
            int end = grid[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (grid[i][mid] < 0) {
                    if (mid > 0 && grid[i][mid - 1] < 0)
                        end = mid - 1;
                    else {
                        firstNeg = mid;
                        break;
                    }
                } else if (grid[i][mid] >= 0)
                    start = mid + 1;
            }
            if(firstNeg!=-1)
                count += grid[i].length - firstNeg;
        }
        return count;
    }
}