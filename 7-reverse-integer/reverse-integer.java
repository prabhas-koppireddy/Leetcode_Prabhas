class Solution {
    public int reverse(int x) {
        int rem = 0, rev = 0;
        while(x != 0){
            rem = x % 10;
            x = x / 10;
            // overflow check
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE && rem > 7){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE && rem < -8){
                return 0;
            }
            rev = (rev * 10) + rem;
        }
        return rev;
    }
}