class Solution {
    public int hardestWorker(int n, int[][] l) {
        int max=l[0][1],in=l[0][0], j=0;
        for(int i=1;i<l.length;i++){
            if((l[i][1]-l[j][1])==max){
                in=Math.min(in,l[i][0]);
            }else if((l[i][1]-l[j][1])>max){
                in=l[i][0];
                max=l[i][1]-l[j][1];
            }
            j++;
        }
        return in;
    }
}
