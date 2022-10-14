class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer> map =new HashMap<>();
        map.put(s.charAt(0),0);
        for(int i=1;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int j=map.get(s.charAt(i));
                int c=(int)(s.charAt(i)-'a');
                if((i-j-1)!=distance[c])return false;
            }
            map.put(s.charAt(i),i);
        }
        return true;
    }
}
