class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int longest = 0;
        for(int s : set){
            if(!set.contains(s - 1)){
                int currNum = s;
                int count = 1;
                while(set.contains(currNum + 1)){
                    currNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}