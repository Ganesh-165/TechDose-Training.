class Solution {
    public boolean divideArray(int[] n) {
        int freq[]=new int[501];
        for(int i=0;i<n.length;i++)freq[n[i]]++;
        for(int i=0;i<501;i++){
            if(freq[i]%2!=0)return false;
        }
        return true;
    }
}
