class Solution {
    public int minimumRecolors(String b, int k) {
        int wcount=0,bcount=0,min=Integer.MAX_VALUE;
        if(b.length()==1){
            if(b.charAt(0)=='W')return 1;
            return 0;
        }
        int j=0;
        for(int i=0;i<b.length();i++){
            if(i>=k){
                if(bcount+wcount==k)min=Math.min(wcount,min);
                if(b.charAt(j)=='B')bcount--;
                if(b.charAt(j)=='W')wcount--;
                j++;
            }
            if(b.charAt(i)=='B')bcount++;
            if(b.charAt(i)=='W')wcount++;
        }
        min=Math.min(wcount,min);
        return min;
    }
}
