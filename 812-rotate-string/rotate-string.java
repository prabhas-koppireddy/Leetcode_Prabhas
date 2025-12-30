class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int n = s.length();
        StringBuilder str = new StringBuilder(s);
        while(n-->0){
            if(str.toString().equals(goal)){
                return true;
            }
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
        }
        return false;
    }
}