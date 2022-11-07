class Solution {
    public List<String> letterCombinations(String d) {
        if(d.length()==0)return new ArrayList<>();
        List<String> list =new ArrayList<>();
        String w[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        dfs(list,w,d.toCharArray(),"");
        return list;
    }
    public void dfs(List<String> list,String[] w,char[] d,String s){
        if(s.length()==d.length){
            list.add(s);
            return ;
        }
        int a=s.length();
        int di=d[a]-'0';
        for(char l:w[di].toCharArray()){
            dfs(list,w,d,s+Character.toString(l));
        }
    }
}
