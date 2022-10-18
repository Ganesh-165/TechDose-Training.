class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> li=new ArrayList<>();
        int l=0,r=mat[0].length-1,t=0,b=mat.length-1;
        while(true){
            for(int i=l;i<=r;i++)li.add(mat[t][i]);
            t++;
            if(l>r||t>b)break;
            for(int i=t;i<=b;i++)li.add(mat[i][r]);
            r--;
            if(l>r||t>b)break;
            for(int i=r;i>=l;i--)li.add(mat[b][i]);
            b--;
            if(l>r||t>b)break;
            for(int i=b;i>=t;i--)li.add(mat[i][l]);
            l++;
            if(l>r||t>b)break;
        }
        return li;
    }
}
