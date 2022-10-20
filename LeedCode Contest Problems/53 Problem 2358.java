class Solution {
    public int maximumGroups(int[] g) {
        int n=g.length;
        int t=0,k=0;
        while(k+t+1<=n){
            t+=++k;
        }
        return k;
    }
}
