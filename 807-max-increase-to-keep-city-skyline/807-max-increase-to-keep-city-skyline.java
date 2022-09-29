class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxrow[] = new int[n];
        int maxcol[] = new int[m];
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++){
                maxrow[i] = Math.max(maxrow[i], grid[i][j]);
                maxcol[j] = Math.max(maxcol[j], grid[i][j]);
            }
        int count = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++)
                count += (Math.min(maxrow[i], maxcol[j]) - grid[i][j]);
                
        return count;    
    }
}