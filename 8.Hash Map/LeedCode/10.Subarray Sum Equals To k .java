class Solution {
    public int subarraySum(int[] n, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for(int i:n){
            sum+=i;
            if(map.containsKey(sum-k))count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
