class Solution {
    public void rotate(int[][] mat) {
        int rl=mat.length;
        for(int r=0;r<rl;r++){
            for(int c=0;c<r;c++){
                int temp=mat[r][c];
                mat[r][c]=mat[c][r];
                mat[c][r]=temp;
            }
        }
        for(int i=0;i<rl;i++){
            int l=0,h=mat[i].length-1;
            while(l<h){
                int temp=mat[i][l];
                mat[i][l++]=mat[i][h];
                mat[i][h--]=temp;
            }
        }
    }
}
