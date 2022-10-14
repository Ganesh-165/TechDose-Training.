class Solution {
    public int largestInteger(int n) {
        char c[]=String.valueOf(n).toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[j]>c[i]&&(c[j]-c[i])%2==0){
                    char a=c[i];
                    c[i]=c[j];
                    c[j]=a;
                }
            }
        }
        return Integer.parseInt(new String(c));
    }
}
