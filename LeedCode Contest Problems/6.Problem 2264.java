class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        char n[]=num.toCharArray();
        String s="";
        for(int i=0;i<n.length-2;i++){
            String a=""+n[i]+n[i+1]+n[i+2];
            if(n[i]==n[i+1]&&n[i+1]==n[i+2]){
                if(Integer.parseInt(a)>max)s=a;
                max=Math.max(max,Integer.parseInt(a));
            }
        }
        return s;
    }
}
