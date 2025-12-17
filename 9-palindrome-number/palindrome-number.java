class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = x;
        while(x > 0){
            int rem = x % 10;
            rev = rem + (rev * 10);
            x = x / 10;
        }
        if(rev == n){
            return true;
        }
        else return false;
    }
}