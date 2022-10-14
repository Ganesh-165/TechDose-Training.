class Solution {
    public int[] answerQueries(int[] n, int[] q) {
        Arrays.sort(n);
        int ans[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            int count=0;
            int sum=0;
            for(int j=0;j<n.length;j++){
                if(sum+n[j]>q[i])break;
                sum+=n[j];
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}
