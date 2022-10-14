class Solution {
    public boolean equalFrequency(String w) {
        int freq[]=new int[26];
        char c=w.charAt(0);
        int c1=0;
        for(int i=0;i<w.length();i++){
            freq[w.charAt(i)-'a']++;
            if(w.charAt(i)==c)c1++;
        }
        int count=0;
        for(int i=1;i<w.length();i++){
            count+=Math.abs(freq[w.charAt(i)-'a']-freq[w.charAt(i-1)-'a']);
        }
        if(count==1 || c1==w.length())return true;
        else return false;
    }
}
