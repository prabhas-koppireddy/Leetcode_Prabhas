class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length, count = 0;
        for(int i = 0;i < n;i ++){
            if(nums[i] % 3 != 0){
                count = count + 1; // Every one operation increments count by 1.
            }
        }
        return count;
    }
}