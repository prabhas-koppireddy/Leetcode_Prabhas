class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int index = 0;
        for(int i=0;i<n;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}