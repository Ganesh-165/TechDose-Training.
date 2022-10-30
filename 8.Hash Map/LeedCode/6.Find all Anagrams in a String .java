class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())return new ArrayList<Integer>();
        List<Integer> li=new ArrayList<>();
        char c[]=p.toCharArray();
        char d[]=s.toCharArray();
        long p1[]=new long[26];
        long s1[]=new long[26];
        for(int i=0;i<c.length;i++){
            p1[c[i]-'a']++;
            s1[d[i]-'a']++;
        }
        int i=0,j=c.length;
        for(;j<d.length;i++,j++){
            boolean val=count(p1,s1);
            if(val)li.add(i);
            s1[d[i]-'a']--;
            s1[d[j]-'a']++;
            
        }
        boolean t=count(p1,s1);
        if(t)li.add(i);
        return li;
    }
    public boolean count(long[] p1, long[] s1){
        for(int i=0;i<26;i++){
            if(p1[i]!=s1[i])return false;
        }
        return true;
    }
}
