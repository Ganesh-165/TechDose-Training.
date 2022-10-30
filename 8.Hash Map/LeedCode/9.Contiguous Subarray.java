class Solution {
    public int findMaxLength(int[] n) {
        int sum=0,max=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n.length;i++){
            if(n[i]==0)n[i]=-1;
            sum+=n[i];
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else{
               map.put(sum,i); 
            }
        }
        return max;
    }
}
