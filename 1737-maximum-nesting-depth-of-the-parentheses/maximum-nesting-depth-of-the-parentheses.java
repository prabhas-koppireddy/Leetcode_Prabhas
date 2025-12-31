class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int curr = 0, max = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                curr++;
                max = Math.max(max,curr);
            }
            else if(s.charAt(i) == ')'){
                curr--;
            }
        }
        return max;
    }
}