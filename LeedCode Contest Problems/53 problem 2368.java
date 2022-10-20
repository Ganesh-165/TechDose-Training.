class Solution {
    public int reachableNodes(int n, int[][] e, int[] r) {
        List<List<Integer>> li=new ArrayList<>();
        boolean v[]=new boolean[n];
        Set<Integer> set=new HashSet<>();
        for(int i:r)set.add(i);
        for(int i=0;i<n;i++)li.add(new ArrayList<>());
        for(int i[]:e){
            li.get(i[0]).add(i[1]);
            li.get(i[1]).add(i[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        v[0]=true;
        int ans=1;
        while(!q.isEmpty()){
            int i=q.remove();
            List<Integer> l=li.get(i);
            for(int j:l){
                if(!v[j]&&!set.contains(j)){
                    v[j]=true;
                    q.add(j);
                    ans++;
                }
            }
        }
        return ans;
    }
}
