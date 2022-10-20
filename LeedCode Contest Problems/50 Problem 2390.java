class Solution {
    public String removeStars(String s) {
        StringBuilder r=new StringBuilder(); 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*')r.setLength(r.length()-1);
            else r.append(s.charAt(i));
        }
        return new String(r);
    }
}
