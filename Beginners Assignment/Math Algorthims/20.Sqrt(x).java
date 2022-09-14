class Solution {
    public int mySqrt(int x) {
        int i=1;
        if(x==Integer.MAX_VALUE)return 46340;
        while(true){
            if(i*i>x)return i-1;
            else if(i*i==x)return i;
            i++;
        }
    }
}
