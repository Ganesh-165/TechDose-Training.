class Solution {
    public int countAsterisks(String s) {
        String str[]=s.split("[^a-z*]");
        int count=0;
        for(int i=0;i<str.length;i++){
            if(i%2==0){
                for(int j=0;j<str[i].length();j++){
                    if(str[i].charAt(j)=='*')count++;
                }
            }
        }
        return count;
    }
}
