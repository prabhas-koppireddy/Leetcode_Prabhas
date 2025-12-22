class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
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
                ans.add(nums1[i]);
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