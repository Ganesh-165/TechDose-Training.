class Solution {
    public int findClosestNumber(int[] n) {
        int min=Integer.MAX_VALUE;
        int closestsum=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(Math.abs(n[i])<min){
                min=Math.abs(n[i]);
                closestsum=n[i];
            }
            else if(min==Math.abs(n[i])&&closestsum<n[i])closestsum=n[i];
        }
        return closestsum;
    }
}
