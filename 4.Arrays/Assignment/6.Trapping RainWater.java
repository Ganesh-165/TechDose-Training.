class Solution {
    public int trap(int[] height) {
        int arr[]=new int[height.length];
        int max=0,smax=0;
        for(int i=1;i<height.length;i++){
            max=Math.max(height[i-1],max);
            arr[i]=max;
        }arr[height.length-1]=0;
        int sum=0;
        for(int i=height.length-2;i>=0;i--){
            smax=Math.max(height[i+1],smax);
            arr[i]=Math.min(arr[i],smax);
            if(arr[i]-height[i]<=0)continue;
            sum+=Math.abs(arr[i]-height[i]);
        }
        return sum;
    }
}
