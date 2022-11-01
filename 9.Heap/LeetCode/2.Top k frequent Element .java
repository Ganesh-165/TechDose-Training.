class Solution {
    public int[] topKFrequent(int[] n, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i:n){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        q.addAll(map.keySet());
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll();
        }
        return res;
    }
}
