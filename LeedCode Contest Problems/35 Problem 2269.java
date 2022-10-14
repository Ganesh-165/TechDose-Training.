class Solution {
    public int divisorSubstrings(int num, int k) {
        int sum=0,a=0,b=k;
        String str=Integer.toString(num);
        for(int i=0;i<str.length()-k+1;i++){
            int val=Integer.parseInt(str.substring(a,b));
            if(val!=0 && num%val==0)sum++;
            a++;
            b++;
        }return sum;
    }
}
