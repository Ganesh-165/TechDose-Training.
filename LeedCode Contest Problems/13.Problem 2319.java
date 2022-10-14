class Solution {
    public boolean checkXMatrix(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j)||(j==n-i-1)){
                    if(mat[i][j]==0)return false;
                }
                else if(mat[i][j]!=0)return false;
            }
        }
        return true;
    }
}
