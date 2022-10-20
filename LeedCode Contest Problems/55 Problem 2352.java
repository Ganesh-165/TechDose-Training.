class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                boolean c=true;
                for(int k=0;k<grid[0].length;k++){
                    if(grid[i][k]!=grid[k][j]){
                        c=false;
                    }
                }
                if(c)count++;
            }
        }
        return count;
    }
}
