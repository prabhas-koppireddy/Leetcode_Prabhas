class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        int a = nums1.length;
        int b = nums2.length;
        int i = 0, j = 0;
        while(i < a && j < b){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                if(ans.isEmpty() || ans.get(ans.size()-1) != nums1[i]){
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] inter = new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            inter[k] = ans.get(k);
        }
        return inter;
    }
}