class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); 
        int n = s.length();
        String a = s;
        StringBuilder rev = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        if(a.equals(rev.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}