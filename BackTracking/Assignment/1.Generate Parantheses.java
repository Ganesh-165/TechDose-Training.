class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        dfs("",list,n,n);
        return list;
    }
    public static void dfs(String s,List<String> list,int left,int right){
        if(left>right){
            return ;
        }
        if(left>0){
            dfs(s+"(",list,left-1,right);
        }
        if(right>0){
            dfs(s+")",list,left,right-1);
        }
        if(right==0&&left==0){
            list.add(s);
            s="";
            return ;
        }
    }
}
