class Solution {
    public int mostFrequent(int[] n, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,ans=-1;
        for(int i=0;i<n.length-1;i++){
            if(n[i]==k){
                if(!map.containsKey(n[i+1])){
                    map.put(n[i+1],1);
                }else{
                    map.put(n[i+1],map.get(n[i+1])+1);
                }
                if(map.get(n[i+1])>max){
                    max=map.get(n[i+1]);
                    ans=n[i+1];
                }
            }
        }
        return ans;
    }
}
