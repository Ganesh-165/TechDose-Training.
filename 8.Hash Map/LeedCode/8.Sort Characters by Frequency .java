class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        q.addAll(map.keySet());
        StringBuilder str=new StringBuilder("");
        while(!q.isEmpty()){
            char c=q.poll();
            int count=map.get(c);
            while(count!=0){
                str.append(c);
                count--;
            }
        }
        return new String(str);
    }
}
