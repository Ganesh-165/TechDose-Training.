class Solution {
    public int mostFrequentEven(int[] n) {
        if(n.length==1 && n[0]%2==0)return n[0];
        int max=1;
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(n[0],1);
        for(int i=1;i<n.length;i++){
            if(map.containsKey(n[i]) && n[i]%2==0){
                map.put(n[i],map.get(n[i])+1);
                if(max<map.get(n[i]))max=map.get(n[i]);
            }
            else if(n[i]%2==0){
                map.put(n[i],1);
                if(max<map.get(n[i]))max=map.get(n[i]);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==max && entry.getKey()%2==0)return entry.getKey();
        }
        return -1;
    }
}
