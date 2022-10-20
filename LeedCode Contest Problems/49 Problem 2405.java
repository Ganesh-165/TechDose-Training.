class Solution {
    public int partitionString(String s) {
        int ans=1;
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                ans++;
                set.clear();
                set.add(s.charAt(i));
            }
        }
        return ans;
    }
}
