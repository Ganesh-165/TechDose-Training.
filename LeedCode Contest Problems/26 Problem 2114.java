class Solution {
    public int mostWordsFound(String[] sen) {
        int max=0;
        for(String s:sen){
            s.trim();
            long count=s.chars().filter(ch -> ch == ' ').count();
            max=Math.max(max,(int)count);
        }
        return max+1;
    }
}
