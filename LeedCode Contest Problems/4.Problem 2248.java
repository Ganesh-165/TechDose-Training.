class Solution {
    public List<Integer> intersection(int[][] n) {
        int freq[]=new int[1001];
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                freq[n[i][j]]++;
            }
        }
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(freq[i]==n.length)list.add(i);
        }
        return list;
    }
}
