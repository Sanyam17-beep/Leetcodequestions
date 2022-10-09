class Solution {
    int mod=(int)1e9+7;
    public int numberOfPaths(int[][] grid, int k) {
        Integer[][][] dp=new Integer[grid.length+1][grid[0].length][50];
      return paths(grid,k,0,0,grid.length-1,grid[0].length-1,0,dp);  
    }
     public int paths(int[][] grid, int k,int sr,int sc,int dr,int dc,int target,Integer[][][] dp) {
              if(sr==dr&&sc==dc){
          
          target+=grid[sr][sc];
           if(target%k==0){
               return 1;
           }
           else{
               return 0;
           }
       }
         
          if(sr < 0 || sr == grid.length || sc < 0 || sc == grid[0].length) {
            return 0;
        }
         if(dp[sr][sc][target%k]!=null){
             return dp[sr][sc][target%k];
         }
        int count=0;
         
         count+=paths(grid,k,sr+1,sc,dr,dc,target+grid[sr][sc],dp);
             count+=paths(grid,k,sr,sc+1,dr,dc,target+grid[sr][sc],dp);

         return dp[sr][sc][target%k]=count%mod;
    }
}