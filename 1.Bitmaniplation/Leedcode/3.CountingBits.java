class Solution {
    public int[] countBits(int n) {
        int ptr=0;
        int res[]=new int[n+1];
        for(int j=0;j<=n;j++){
            int i=j;
            int count=0;
            while(i!=0){
                i=(i&(i-1));
                count++;
            }
            res[ptr++]=count;
        }
        return res;
    }
}
