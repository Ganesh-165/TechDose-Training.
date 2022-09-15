class Solution {
    public int maximumGap(int[] n) {
        if(n.length<2)return 0;
        int max=0,max1=0;
        for(int i=0;i<n.length;i++){
            max=Math.max(n[i],max);
        }
        int p=1;
        while(max/p >0){
            int output[]=new int[n.length];
            int count[]=new int[10];
            for(int i=0;i<n.length;i++){
                count[(n[i]/p)%10]++;
            }for(int i=1;i<10;i++)count[i]+=count[i-1];
            for(int i=n.length-1;i>=0;i--){
                output[count[(n[i]/p)%10]-1]=n[i];
                count[(n[i]/p)%10]--;
            }
            for(int i=0;i<n.length;i++){
                n[i]=output[i];
            }
            p*=10;
        }
        for(int i=1;i<n.length;i++){
            max1=Math.max(max1,n[i]-n[i-1]);
        }
        return max1;
    }
}
