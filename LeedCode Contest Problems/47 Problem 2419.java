class Solution {
    public int longestSubarray(int[] n) {
        int max=0;
        for(int i:n)max=Math.max(max,i);
        int res=0,l=0;
        for(int i:n){
            if(max==i)l++;
            else l=0;
            res=Math.max(l,res);
        }
        return res;
    }
}
