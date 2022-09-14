class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)return 0;
        s=s.trim();
        if(s.length()==0)return 0;
        int start=0,sign=1;
        long sum=0;
        if(s.charAt(start)=='+'){
            sign=1;
            start++;
        }
        else if(s.charAt(start)=='-'){
            sign=-1;
            start++;
        }
        while(start<s.length()){
            if(!(Character.isDigit(s.charAt(start))))
                return (int)sum*sign;
            sum=(sum*10)+(s.charAt(start)-'0');
            if(sum>Integer.MAX_VALUE && sign==1)
                return Integer.MAX_VALUE;
            if(sum*(-1)<Integer.MIN_VALUE && sign==-1)
                return Integer.MIN_VALUE;
            start++;
        }
        return (int)sum*sign;
        
    }
}
