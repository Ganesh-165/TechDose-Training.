class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            char[] str=s1.toCharArray();
            Arrays.sort(str);
            String s= new String(str);
            if(map.containsKey(s)){
                map.get(s).add(s1);
            }else{
                map.put(s,new ArrayList<>());
                map.get(s).add(s1);
            }
        }
        return new ArrayList(map.values());
    }
}
