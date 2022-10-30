class Solution {
    public int largestRectangleArea(int[] h) {
        if(h.length==0)return 0;
        if(h.length==1)return h[0];
        Stack<Integer> st =new Stack<>();
        int max=0;
        for(int i=0;i<=h.length;i++){
            while((!st.isEmpty()) && (i==h.length || h[st.peek()]>=h[i])){
                int h1=h[st.pop()];
                int l=st.isEmpty()?-1:st.peek();
                max=Math.max(max,(i-1-l)*h1);
            }
            st.push(i);
        }
        return max;
    }
}
