class Solution {

    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        // finding breakpoint
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(nums[index] < nums[i]){
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            break;
            }
        }
        reverse(nums,index + 1,n - 1);
    }
}