class Solution {
    public int minMaxGame(int[] n) {
        for(int a=n.length;a>1;a-=(a/2)){
            for(int j=0;j<a/2;j++){
                if(j%2==0){
                    n[j]=Math.min(n[2*j],n[2*j+1]);
                }
                else{
                    n[j]=Math.max(n[2*j],n[2*j+1]);
                }
            }
        }
        return n[0];
    }
}
