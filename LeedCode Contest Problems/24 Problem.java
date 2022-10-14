class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        int m=n.length;
        Map<Integer,String> map=new TreeMap<>();
        for(int i=0;i<m;i++){
            map.put(h[i],n[i]);
        }int i=m-1;
        for(String s:map.values()){
            n[i--]=s;
        }
        return n;
    }
}
