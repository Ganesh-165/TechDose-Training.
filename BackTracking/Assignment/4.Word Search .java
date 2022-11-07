class Solution {
    boolean s[][];
    int row,col;
    Set<String> set;
    int maxlen;
    Set<String> res;
    public List<String> findWords(char[][] b, String[] w) {
        res=new HashSet<>();
        row=b.length;
        col=b[0].length;
        s=new boolean[row][col];
        set=new HashSet<>();
        for(String i:w){
            set.add(i);
            maxlen=Math.max(maxlen,i.length());
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dfs(b,i,j,new StringBuilder(),0);
            }
        }
        return new ArrayList<>(res);
    }
    public void dfs(char[][] b,int r,int c,StringBuilder sb,int len){
        if(r<0 || c<0 || r>=row||c>=col ||s[r][c]||len>=maxlen)return ;
        s[r][c]=true;
        sb.append(b[r][c]);
        if(set.contains(sb.toString()))res.add(sb.toString());
        dfs(b,r+1,c,sb,len);
        dfs(b,r,c+1,sb,len);
        dfs(b,r,c-1,sb,len);
        dfs(b,r-1,c,sb,len);
        s[r][c]=false;
        sb.setLength(sb.length()-1);
        return ;
    }
}
