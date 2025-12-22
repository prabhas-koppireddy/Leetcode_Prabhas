class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int deviation = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                deviation++;
            }
        }
        if(nums[n-1] > nums[0]){
                deviation++;
        }
        return deviation<=1;
    }
}