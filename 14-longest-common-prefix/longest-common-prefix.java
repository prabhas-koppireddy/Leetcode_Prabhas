class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[n - 1];
        int index = 0;
        while(index < s1.length() && s1.charAt(index) == s2.charAt(index)){
            index++;
        }
        return index==0?"":s1.substring(0,index);
    }
}