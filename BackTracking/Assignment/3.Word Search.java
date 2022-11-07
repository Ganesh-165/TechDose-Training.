class Solution {
    public boolean exist(char[][] b, String w) {
        int r=b.length;
        int c=b[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dfs(b,w,r,c,i,j,0))return true;
            }
        }
        return false;
    }
    public boolean dfs(char b[][],String w,int r,int c,int i,int j,int p){
        if(p==w.length())return true;
        if(i<0||j<0||i>=r||j>=c||b[i][j]!=w.charAt(p)||b[i][j]=='$')return false;
        char temp=b[i][j];
        b[i][j]='$';
        if(dfs(b,w,r,c,i,j+1,p+1)||dfs(b,w,r,c,i+1,j,p+1)||dfs(b,w,r,c,i-1,j,p+1)||dfs(b,w,r,c,i,j-1,p+1))return true;
        b[i][j]=temp;
        return false;
    }
}
