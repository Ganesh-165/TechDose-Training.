class Solution {
    public String bestHand(int[] r, char[] s) {
        int scount=0;
        char c=s[0];
        int freq[]=new int[14];
        for(int i=0;i<r.length;i++){
            if(c==s[i])scount++;
            freq[r[i]]++;
        }
        if(scount==s.length) return "Flush";
        for(int i=0;i<14;i++){
            if(freq[i]>=3)return "Three of a Kind";
        }
        for(int i=0;i<14;i++){
            if(freq[i]==2)return "Pair";
        }
        return "High Card";
    }
}
