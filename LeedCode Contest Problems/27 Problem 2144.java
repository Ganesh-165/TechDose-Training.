class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1)return cost[0];
        Arrays.sort(cost);
        int sum=0,i=cost.length-1,count=0;
        while(i>=0){
            if(count!=2){
                sum+=cost[i];
                count++;
            }else count=0;
            i--;
        }
        return sum;
    }
}
