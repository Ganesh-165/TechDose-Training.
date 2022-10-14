class Solution {
    public int rearrangeCharacters(String s, String t) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int max=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)freq1[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++)freq2[t.charAt(i)-'a']++;
        for(int i=0;i<26;i++){
            if(freq2[i]>0){
                max=Math.min(max,freq1[i]/freq2[i]);  
            }
        }
        return max;
    }
}
