class Solution {
    public List<List<Integer>> combinationSum(int[] n, int t) {
        List<List<Integer>> list =new ArrayList<>();
        dfs(list,new ArrayList<>(),n,t,0);
        return list;
    }
    public void dfs(List<List<Integer>> list,List<Integer> d,int[] n,int t,int s){
        if(t<0)return ;
        if(t==0){
            list.add(new ArrayList<>(d));
            return ;
        }
        for(int i=s;i<n.length;i++){
            d.add(n[i]);
            dfs(list,d,n,t-n[i],i);
            d.remove(d.size()-1);
        }
    }
}
