class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];int maximum=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            maximum=Math.max(arr[i]-min,maximum);
        }
        return maximum;
    }
}
