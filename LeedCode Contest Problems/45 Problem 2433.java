class Solution {
    public int[] findArray(int[] p) {
        int prev=0;
        for(int i=0;i<p.length;i++){
            p[i]=p[i]^prev;
            prev=prev^p[i];
        }
        return p;
    }
}
