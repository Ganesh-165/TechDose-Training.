class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            if (hashMap.containsKey(edges[i])) {
                long temp = hashMap.get(edges[i]);
                temp = temp + i;
                hashMap.put(edges[i], temp);
            }
            else hashMap.put(edges[i], i*1L);
        }
        long high = Long.MIN_VALUE;
        int ans = 0;
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) > high) {
                high = hashMap.get(key);
                ans = key;
            }
            if(hashMap.get(key)==high){
                ans=Math.min(ans,key);
            }
        }
        //System.out.print(hashMap);
        return ans;
    }
}
