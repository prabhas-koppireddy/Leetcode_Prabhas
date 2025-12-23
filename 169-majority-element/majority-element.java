class Solution {
    public int majorityElement(int[] nums) {
        // Moore's voting Algorithm
        int n = nums.length;
        int el = 0, count = 0;
        for(int i=0;i<n;i++){
            if(count == 0){
                count = 1;
                el = nums[i];
            }
            else if(nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == el) count1++;
            if(count1 > n/2) return el;
        }
        return -1;
    }
}