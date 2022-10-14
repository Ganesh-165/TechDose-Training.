class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] i1, int[][] i2) {
        int freq[]=new int[1001];
        for(int i=0;i<i1.length;i++)freq[i1[i][0]]+=i1[i][1];
        for(int i=0;i<i2.length;i++)freq[i2[i][0]]+=i2[i][1];
        List<List<Integer>> list =new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(freq[i]>0){
                List<Integer> li=new ArrayList<>();
                li.add(i);
                li.add(freq[i]);
                list.add(li);
            }
        }
        return list;
    }
}
