class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String temp="";
            int i=0;
            while(i<s.length()){
                String a=s.substring(i,Math.min(i+k,s.length()));
                int sum=0;
                for(int j=0;j<a.length();j++){
                    sum+=a.charAt(j)-'0';
                }
                temp+=""+sum;
                i+=k;
            }
            s=temp;
        }
        return s;
    }
}
