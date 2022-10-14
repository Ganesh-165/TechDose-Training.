class Solution {
    public int percentageLetter(String str, char l) {
        float count=0;
        char s[]=str.toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]==l)count++;
        }
        return (int)(count*100)/s.length;
    }
}
