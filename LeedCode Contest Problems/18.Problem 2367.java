class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int ret=0;
        for(int i=0;i<nums.length;i++){
            if((i==0||nums[i]!=nums[i-1])&&nums[i]!=0){
                ret++;
            }
        } return ret;
    }
}
