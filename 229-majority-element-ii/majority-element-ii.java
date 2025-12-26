class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0, el1 = Integer.MIN_VALUE, cnt2 = 0, el2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1 == 0 && nums[i] != el2){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int count1 = 0, count2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == el1) count1++;
            if(nums[i] == el2) count2++;
        }
        int min = n/3 + 1;
        if(count1 >= min) ans.add(el1);
        if(count2 >= min) ans.add(el2);
        return ans;
    }
}