class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Map<String,List<String>> memo = new HashMap<>();
          
       return helper(dict, s , memo);
    }
    private List<String> helper(Set<String> dict , String s , Map<String,List<String>> memo){
        if(memo.containsKey(s))
            return memo.get(s);
        List<String> ans = new ArrayList<>();
        if(s == null || s.isEmpty()){
            return ans;
          }
        int N = s.length();
        for(String word : dict){
            if(!s.startsWith(word)){
               continue;
            } 
            int len = word.length();
           if(N == len){
               ans.add(word);
           }else{
               List<String> res = helper(dict , s.substring(len),memo );
               for(String str : res){
                   ans.add( word + " " + str);
               }
           }
        }
        memo.put(s,ans);
      return ans;  
    }
}
