class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length == 0) return nums;
        bubbleSort(nums);
    }
    private void bubbleSort(int[] nums) {
        for (int k = nums.length - 1; k >= 1; k--) {
          boolean flag=true;
            for (int i = 0; i < k; i++) {
                if (nums[i] > nums[i + 1]){
                  swap(nums, i, i + 1);
                  flag=false;
                }
            }
          if(flag)return ;
        }
    }
    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
          nums[i]=sc.nextInt();
        }
        sortArray(nums);
        System.out.println(nums);
    }
}
