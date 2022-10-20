class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int max=0;
        int i=1,j=0;
        while(i<n){
            char c=s.charAt(i);
            char d=s.charAt(i-1);
            if(c-1!=d)
            {  
                if(max<i-j)max=i-j;
                j=i;
            }
            i++;
        }
        return (max<i-j)?i-j:max;
    }
}
