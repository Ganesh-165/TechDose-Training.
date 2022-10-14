class Solution {
    public boolean digitCount(String n) {
        int freq[]=new int[10];
        for(int i=0;i<n.length();i++){
            freq[n.charAt(i)-'0']++;
        }
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!=(freq[i])+'0')return false;
        }
        return true;
    }
}
