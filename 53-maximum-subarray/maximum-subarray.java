class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int n = nums.length;
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > max){
                max = Math.max(max,sum);
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}