class Solution {
    public int maxSum(int[][] g) {
        int max=Integer.MIN_VALUE;
        for(int i=1;i<g.length-1;i++){
            for(int j=1;j<g[i].length-1;j++){
                int k=val(g,i,j);
                max=Math.max(max,k);
            }
        }
        return max;
    }
    public int val(int g[][],int i,int j){
        return g[i][j]+g[i-1][j-1]+g[i-1][j]+g[i-1][j+1]+g[i+1][j]+g[i+1][j-1]+g[i+1][j+1];
    }
}
