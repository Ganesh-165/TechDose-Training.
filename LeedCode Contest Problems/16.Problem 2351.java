class Solution {
    public char repeatedCharacter(String s) {
        if(s.length()==2)return s.charAt(0);
        int freq[]=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
            if(freq[s.charAt(i)]>1)return s.charAt(i);
        }
        return 0;
    }
}
