class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==0||n.length==0)return new int[0];
        int res[]=new int[n.length-k];
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<n.length;i++){
            int s=i-k;
            if(s>=0){
                q.remove(n[s]);
            }
            q.offer(n[i]);
            if(q.size()==k){
                res[i-k+1]=q.peek();
            }
        }
        return res;
    }
}
