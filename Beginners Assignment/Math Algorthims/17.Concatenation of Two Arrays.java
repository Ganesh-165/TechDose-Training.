class Solution {
    public int[] getConcatenation(int[] n) {
        int ans[]=new int[2*n.length];
        for(int i=0;i<n.length;i++){
            ans[i]=n[i];
            ans[i+n.length]=n[i];
        }
        return ans;
    }
}
