class Solution {
    public int singleNumber(int[] n) {
        int ans=0;
        for(int i=0;i<=31;i++){
            int one=0;
            for(int j=0;j<n.length;j++){
                if(((n[j]>>i)&1)==1)one++;
            }
            one%=3;
            if(one!=0)ans|=one<<i;
        }
        return ans;
    }
}
