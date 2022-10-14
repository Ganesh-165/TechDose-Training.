class Solution {
    public int countPairs(int[] n, int k) {
        int count=0;
        Map<Integer,List<Integer>> map =new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(!map.containsKey(n[i])){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(n[i],l);
            }
            else{
                List<Integer> l=map.get(n[i]);
                for(Integer j:l){
                    if((j*i)%k==0)count++;
                }
                l.add(i);
                map.put(n[i],l);
            }
        }
        return count;
    }
}
