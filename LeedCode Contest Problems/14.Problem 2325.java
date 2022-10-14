class Solution {
    public String decodeMessage(String k, String m) {
        Map<Character,Character> map =new HashMap<>();
        char ch='a';
        char c[]=k.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==' ')continue;
            if(!map.containsKey(c[i]))map.put(c[i],ch++);
        }
        String s="";
        for(int i=0;i<m.length();i++){
            char a=m.charAt(i);
            if(a==' ')s+=' ';
            else s+=map.get(a);
        }
        return s;
    }
}
