class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int startCol = 0, endCol = mat[0].length-1;
        
        while(startCol <= endCol){
            int maxRow = 0, midCol = startCol + (endCol-startCol)/2;
            
            for(int row=0; row<mat.length; row++){
                 maxRow = mat[row][midCol] >= mat[maxRow][midCol]? row : maxRow;  
            }
            
 boolean left   =   midCol-1 >= startCol  &&  mat[maxRow][midCol-1] >mat[maxRow][midCol]; boolean right   =   midCol+1 <= endCol    &&  mat[maxRow][midCol+1] > mat[maxRow][midCol];
            
            if(!left && !right)
                return new int[]{maxRow, midCol};
            
            else if(right)
                startCol = midCol+1;
            else 
                endCol = midCol-1;
        }
        return null;  
    }
}