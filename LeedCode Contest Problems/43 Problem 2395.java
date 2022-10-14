class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        int i=1,j=0;
        while(i<nums.length){
            map.put(nums[i]+nums[j],map.getOrDefault(nums[i]+nums[j],0)+1);
            if(map.get(nums[i]+nums[j])==2)return true;
            i++;
            j++;
        }
        return false;
    }
}
