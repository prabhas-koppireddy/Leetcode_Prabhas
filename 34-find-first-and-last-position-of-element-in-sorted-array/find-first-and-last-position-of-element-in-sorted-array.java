class Solution {
    public static int lb(int[] nums, int k){
        int n = nums.length;
        int low = 0, high = n - 1, ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= k){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int ub(int[] nums, int k){
        int n = nums.length;
        int low = 0, high = n - 1, ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > k){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return new int[]{-1,-1};
        int lb = lb(nums, target);
        if(lb == n || nums[lb] != target) return new int[]{-1,-1};
        return new int[]{lb, ub(nums, target) - 1};
    }
}