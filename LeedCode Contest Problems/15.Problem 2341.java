class Solution {
    public int[] numberOfPairs(int[] n) {
        int freq[]=new int[101];
        int ans[]=new int[2];
        for(int i=0;i<n.length;i++)freq[n[i]]++;
        for(int i=0;i<101;i++){
            ans[0]+=freq[i]/2;
            ans[1]+=freq[i]%2;
        }
        return ans;
    }
}
